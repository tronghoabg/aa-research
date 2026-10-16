package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.r;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DesignElements {
    public static final DesignElements INSTANCE = new DesignElements();
    private static HashMap<String, r<String, HashMap<String, String>, Composer, Integer, ab>> map = new HashMap<>();
    public static final int $stable = 8;

    private DesignElements() {
    }

    public final void define(String str, r<? super String, ? super HashMap<String, String>, ? super Composer, ? super Integer, ab> rVar) {
        map.put(str, rVar);
    }

    public final HashMap<String, r<String, HashMap<String, String>, Composer, Integer, ab>> getMap() {
        return map;
    }

    public final void setMap(HashMap<String, r<String, HashMap<String, String>, Composer, Integer, ab>> map2) {
        map = map2;
    }
}
