package com.waze.sdk.a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.a.x;
import android.support.v4.media.a.y;
import android.support.v4.media.a.z;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends i {
    k(Context context, ComponentName componentName) {
        super(context, "com.spotify.music", componentName);
    }

    private final boolean J(String str) {
        return (b() == null || b().d() == null || !b().d().getBoolean(str)) ? false : true;
    }

    private static final boolean K(long j2) {
        return (16 & j2) > 0 || (j2 & 32) > 0;
    }

    @Override // com.waze.sdk.a.i, com.waze.sdk.ah
    public final void m() {
        f("SEEK_15_SECONDS_FORWARD");
    }

    @Override // com.waze.sdk.a.i, com.waze.sdk.ah
    public final void n() {
        f("SEEK_15_SECONDS_BACK");
    }

    @Override // com.waze.sdk.a.i
    final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_SUGGESTED, true);
        bundle.putString("com.spotify.music.extra.SUGGESTED_TYPE", "navigation");
        return bundle;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.waze.sdk.a.i
    final z x(z zVar) {
        x xVar = new x(zVar);
        Bundle bundle = zVar.d() == null ? new Bundle() : new Bundle(zVar.d());
        long jB = zVar.b();
        Iterator it = zVar.f().iterator();
        while (it.hasNext()) {
            String strA = ((y) it.next()).a();
            Iterator it2 = it;
            switch (strA.hashCode()) {
                case -1650614831:
                    if (strA.equals("SEEK_15_SECONDS_FORWARD") && !K(jB)) {
                        jB |= 64;
                        bundle.putInt("waze.state.seekSecs", 15);
                        break;
                    } else {
                        break;
                    }
                    break;
                case -1371245660:
                    if (!strA.equals("ADD_TO_COLLECTION")) {
                        break;
                    } else {
                        xVar.b("waze.favorite");
                        bundle.putBoolean("waze.state.isFavorite", false);
                        break;
                    }
                case -786194937:
                    if (!strA.equals("TURN_SHUFFLE_ON")) {
                        break;
                    } else {
                        xVar.b("waze.shuffle");
                        bundle.putBoolean("waze.state.isShuffleMode", false);
                        break;
                    }
                case -417133416:
                    if (!strA.equals("REMOVE_FROM_COLLECTION")) {
                        break;
                    } else {
                        xVar.b("waze.favorite");
                        bundle.putBoolean("waze.state.isFavorite", true);
                        break;
                    }
                case -361190085:
                    if (strA.equals("SEEK_15_SECONDS_BACK") && !K(jB)) {
                        jB |= 8;
                        bundle.putInt("waze.state.seekSecs", 15);
                        break;
                    } else {
                        break;
                    }
                case -353679052:
                    if (!strA.equals("TURN_REPEAT_ONE_OFF")) {
                        break;
                    } else {
                        xVar.b("waze.repeatOne");
                        bundle.putBoolean("waze.state.isRepeatOneMode", true);
                        break;
                    }
                case 55377647:
                    if (!strA.equals("TURN_REPEAT_ALL_OFF")) {
                        break;
                    } else {
                        xVar.b("waze.repeat");
                        bundle.putBoolean("waze.state.isRepeatMode", true);
                        break;
                    }
                case 1397760551:
                    if (!strA.equals("TURN_SHUFFLE_OFF")) {
                        break;
                    } else {
                        xVar.b("waze.shuffle");
                        bundle.putBoolean("waze.state.isShuffleMode", true);
                        break;
                    }
                case 1544130974:
                    if (!strA.equals("START_RADIO")) {
                        break;
                    } else {
                        xVar.b("waze.startRadio");
                        break;
                    }
                case 1664354367:
                    if (!strA.equals("TURN_REPEAT_ALL_ON")) {
                        break;
                    } else {
                        xVar.b("waze.repeat");
                        bundle.putBoolean("waze.state.isRepeatMode", false);
                        break;
                    }
                case 2066800986:
                    if (!strA.equals("TURN_REPEAT_ONE_ON")) {
                        break;
                    } else {
                        xVar.b("waze.repeatOne");
                        bundle.putBoolean("waze.state.isRepeatOneMode", false);
                        break;
                    }
            }
            it = it2;
        }
        xVar.c(jB);
        xVar.d(bundle);
        return xVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c A[RETURN] */
    @Override // com.waze.sdk.a.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.String z(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -2067515502: goto L56;
                case -1270783436: goto L40;
                case 35404789: goto L2a;
                case 238462336: goto L14;
                case 1881345234: goto L9;
                default: goto L8;
            }
        L8:
            goto L6c
        L9:
            java.lang.String r2 = "waze.startRadio"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L6c
            java.lang.String r2 = "START_RADIO"
            return r2
        L14:
            java.lang.String r0 = "waze.shuffle"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r3 = "waze.state.isShuffleMode"
            boolean r2 = r2.J(r3)
            if (r1 == r2) goto L27
            java.lang.String r2 = "TURN_SHUFFLE_ON"
            return r2
        L27:
            java.lang.String r2 = "TURN_SHUFFLE_OFF"
            return r2
        L2a:
            java.lang.String r0 = "waze.favorite"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r3 = "waze.state.isFavorite"
            boolean r2 = r2.J(r3)
            if (r1 == r2) goto L3d
            java.lang.String r2 = "ADD_TO_COLLECTION"
            return r2
        L3d:
            java.lang.String r2 = "REMOVE_FROM_COLLECTION"
            return r2
        L40:
            java.lang.String r0 = "waze.repeat"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r3 = "waze.state.isRepeatMode"
            boolean r2 = r2.J(r3)
            if (r1 == r2) goto L53
            java.lang.String r2 = "TURN_REPEAT_ALL_ON"
            return r2
        L53:
            java.lang.String r2 = "TURN_REPEAT_ALL_OFF"
            return r2
        L56:
            java.lang.String r0 = "waze.repeatOne"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r3 = "waze.state.isRepeatOneMode"
            boolean r2 = r2.J(r3)
            if (r1 == r2) goto L69
            java.lang.String r2 = "TURN_REPEAT_ONE_ON"
            return r2
        L69:
            java.lang.String r2 = "TURN_REPEAT_ONE_OFF"
            return r2
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sdk.a.k.z(java.lang.String):java.lang.String");
    }
}
