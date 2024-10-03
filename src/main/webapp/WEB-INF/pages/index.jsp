<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body style="background-color: #F5FFFA;">
    <div class="form flex flex-wrap w-full h-[250px] items-center justify-center">
        <form action="" method="" class="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4">
       
        <label class="text-gray-700 text-sm font-bold mb-2" for="planName">Select Plan Name : </label>
        <select class="border" id="planStatus" name="plan status">
            <option value="Now">Now</option>
            <option value="Morning">Morning</option>
            <option value="Night">Night</option>
        </select>
     
         
         
        <label class="text-gray-700 text-sm font-bold mb-2 ml-2" for="planStatus" style="margin-left: 70px;">Select plan status : </label>
        <select class="border" id="planStatus" name="plan status">
            <option value="Now">Now</option>
            <option value="Morning">Morning</option>
            <option value="Night">Night</option>
        </select>
        <label class="text-gray-700 text-sm font-bold mb-2 ml-2" for="gender" style="margin-left: 70px;">Gender : </label>
        <select class="border" id="gender" name="Gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select>
        
        <br>
        <br>
        
       <div class="date-section m-4">
        <label class="text-gray-700 text-sm font-bold mb-2" for="statusstartdate">Select plan start Date : </label>
        <input type="date" name="selectplanstatusdate" id="statusstartdate">
        <label class="text-gray-700 text-sm font-bold mb-2 ml-[60px]" for="statusenddate">Select plan end Date : </label>
        <input type="date" name="selectplanstatusdate" id="statusenddate">
       </div>
       <div class="flex justify-center">
        <button id="search" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded-none" type="submit">Search</button>
       </div>
         
    </form>
    </div>
    
    <script src="https://cdn.tailwindcss.com"></script>
</body>
</html>