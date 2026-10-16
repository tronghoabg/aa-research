package com.carstream.tech.car;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class d {
    public final CarScreen a;

    public d(CarScreen carScreen) {
        this.a = carScreen;
    }

    public final boolean a(String str) {
        CarScreen carScreen = this.a;
        if (carScreen.searchBar.e()) {
            return false;
        }
        carScreen.js("if(window.__cntNav){window.__cntNav('" + str + "');}");
        return true;
    }
}
