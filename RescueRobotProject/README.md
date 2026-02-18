# โครงงาน: Rescue Robot (หุ่นยนต์กู้ภัยอัจฉริยะ)

## ข้อมูลผู้จัดทำ
- ชื่อ: [ใส่ชื่อของคุณ]
- รหัสนักศึกษา: [ใส่รหัส]
- วันที่ส่ง: [ใส่วันที่]

---

## คำอธิบายโครงงาน

โครงงานนี้เป็นการจำลองหุ่นยนต์กู้ภัยที่สามารถทำงานได้หลายบทบาท ได้แก่:

- บินได้ (Flyable)
- วิ่งบนพื้นได้ (Drivable)
- ตรวจจับความร้อน (ThermalSensor)
- ส่งข้อความพร้อมพิกัด (Communicable)

โดยโครงงานนี้มีจุดประสงค์เพื่อแสดงแนวคิด Multiple Inheritance ในภาษา Java 
โดยใช้ Interface และ Composition แทนการสืบทอดหลายคลาส

---

## เหตุผลที่ Java ไม่รองรับ Multiple Inheritance ของ Class

ภาษา Java ไม่อนุญาตให้สืบทอดหลายคลาส (extends ได้เพียง 1 คลาส)
เพื่อป้องกันปัญหา Diamond Problem 
ซึ่งเกิดขึ้นเมื่อมีเมธอดชื่อเดียวกันจากหลายคลาส ทำให้เกิดความกำกวมในการเรียกใช้งาน

---

## แนวทางการออกแบบระบบ

ในโครงงานนี้ใช้แนวทางดังนี้:

### 1. Multiple Interfaces
ใช้ interface หลายตัว ได้แก่:
- Flyable
- Drivable
- ThermalSensor
- Communicable

และให้ RescueRobot implements ทั้ง 4 interfaces

### 2. Composition (Has-a Relationship)
ภายในคลาส RescueRobot ประกอบด้วย:

- Battery
- GPSTracker
- ThermalCamera

ซึ่งเป็นการออกแบบแบบ has-a แทนการสืบทอด

---

## การแก้ปัญหา Default Method ชื่อซ้ำกัน

ใน interface Flyable และ Drivable 
มี default method ชื่อ status() เหมือนกัน

ดังนั้นในคลาส RescueRobot จึงต้อง override เมธอดนี้เอง
และเรียกใช้งานแบบระบุแหล่งที่มา เช่น:

Flyable.super.status()  
Drivable.super.status()

เพื่อแก้ปัญหาความกำกวม

---

## แนวคิด OOP ที่ใช้ในโครงงาน

- Encapsulation (การห่อหุ้มข้อมูล)
- Abstraction (การใช้ Interface)
- Polymorphism (การ implements หลาย interface)
- Composition (การประกอบคลาส)

---

## วิธีคอมไพล์และรันโปรแกรม

```bash
javac *.java
java Main
