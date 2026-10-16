package defpackage;

import android.os.Bundle;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class adpb {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public adpb(Duration duration, Duration duration2) {
        Random random = new Random();
        long millis = duration.toMillis();
        long millis2 = duration2.toMillis();
        woy.N(millis > 0);
        woy.N(millis2 >= millis);
        this.d = duration;
        this.b = duration2;
        this.a = Long.numberOfLeadingZeros(millis) - Long.numberOfLeadingZeros(millis2);
        this.c = random;
    }

    public adpb(Bundle bundle) {
        this.b = fbb.c(bundle, "nav-entry-state:id");
        this.a = fbb.a(bundle, "nav-entry-state:destination-id");
        this.c = fbb.b(bundle, "nav-entry-state:args");
        this.d = fbb.b(bundle, "nav-entry-state:saved-state");
    }

    public adpb(qbu qbuVar, qbu qbuVar2, qbu qbuVar3) {
        this.c = qbuVar;
        this.b = qbuVar2;
        this.d = qbuVar3;
        this.a = 2500;
    }

    public adpb(euq euqVar, int i) {
        this.b = euqVar.c;
        this.a = i;
        this.c = euqVar.a();
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        this.d = bundleZ;
        euqVar.e.c(bundleZ);
    }

    public adpb(int i, ajmd ajmdVar, Executor executor) {
        this.a = i;
        this.d = ajmdVar;
        this.c = executor;
        this.b = new ConcurrentHashMap(8);
    }
}
