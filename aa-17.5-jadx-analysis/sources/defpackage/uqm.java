package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class uqm implements uba {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/v3/callout/CalloutManagerImpl");
    public final ConcurrentHashMap b;
    private final ucf c;

    public uqm(ucf ucfVar, gjv gjvVar) {
        new AtomicLong(0L);
        this.b = new ConcurrentHashMap();
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.c = ucfVar;
        if (gjvVar.r()) {
            ucfVar.C(this);
            ucfVar.F();
        }
    }
}
