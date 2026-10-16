package defpackage;

import android.content.res.Configuration;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarDisplayId;
import java.nio.IntBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class imp implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ imp(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, jiw] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws android.view.Surface.OutOfResourcesException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imp.run():void");
    }

    public /* synthetic */ imp(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public imp(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj2;
        this.c = obj3;
        this.b = obj;
    }

    public /* synthetic */ imp(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ imp(jiw jiwVar, IntBuffer intBuffer, jhc jhcVar, int i) {
        this.d = i;
        this.b = jiwVar;
        this.c = intBuffer;
        this.a = jhcVar;
    }

    public /* synthetic */ imp(qzb qzbVar, DrawingSpec drawingSpec, Configuration configuration, int i) {
        this.d = i;
        this.c = qzbVar;
        this.b = drawingSpec;
        this.a = configuration;
    }

    public /* synthetic */ imp(wyd wydVar, UUID uuid, CarDisplayId carDisplayId, int i) {
        this.d = i;
        this.a = wydVar;
        this.c = uuid;
        this.b = carDisplayId;
    }
}
