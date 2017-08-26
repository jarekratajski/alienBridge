package pl.setblack.alienw;

import lfx2.LFX2Library;

import java.awt.*;


public final class AlienBridge {

    public AlienBridge() {
        this.init();
    }

    private void init() {
        LFX2Library.LFX_Initialize();
        LFX2Library.LFX_Reset();

    }

    public void setColors(AlienSource source, Color color) {
        prepareColor(source,color);
    }

    public void prepareColor(AlienSource source, Color color) {
        LFX2Library.LFX_Light(source.value, color.getRGB());
    }

    public void update() {
        LFX2Library.LFX_Update();
    }

    public void release(){
        LFX2Library.LFX_Release();
    }
}
