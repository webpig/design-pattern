package Command;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // CeilingFan ceilingFan = new CeilingFan("Living Room");

        // CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        // CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        // CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        // remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        // remoteControl.onButtonWasPushed(0);
        // remoteControl.offButtonWasPushed(0);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWaPushed();

        // remoteControl.onButtonWasPushed(1);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWaPushed();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOfff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        Command[] partyOn = { livingRoomLightOn, kitchenLightOn };
        Command[] partyOff = { livingRoomLightOfff, kitchenLightOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);

        // remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOfff);
        // remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        // System.out.println(remoteControl);

        // remoteControl.onButtonWasPushed(0);
        // remoteControl.offButtonWasPushed(0);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWaPushed();
        // remoteControl.offButtonWasPushed(0);
        // remoteControl.onButtonWasPushed(0);
        // remoteControl.onButtonWasPushed(1);
        // remoteControl.offButtonWasPushed(1);
    }
}