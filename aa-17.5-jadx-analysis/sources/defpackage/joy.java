package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.car.CreateAudioRecordRequest;

/* loaded from: classes2.dex */
public final /* synthetic */ class joy implements jpu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ joy(jpw jpwVar, Intent intent, Bundle bundle, int i) {
        this.d = i;
        this.a = jpwVar;
        this.b = intent;
        this.c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qud] */
    @Override // defpackage.jpu, java.util.concurrent.Callable
    public final Object call() throws jnq {
        int i = this.d;
        if (i == 0) {
            return Boolean.valueOf(((jpw) this.a).m().bA((Intent) this.b, (Bundle) this.c));
        }
        Object obj = this.b;
        if (i != 1) {
            return ((jpw) obj).m().Z((String) this.c, (String) this.a);
        }
        return ((jpw) obj).m().x((CreateAudioRecordRequest) this.c, this.a);
    }

    public /* synthetic */ joy(jpw jpwVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.b = jpwVar;
        this.c = obj;
        this.a = obj2;
    }
}
