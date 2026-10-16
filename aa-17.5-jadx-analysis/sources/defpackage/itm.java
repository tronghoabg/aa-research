package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.car.AudioPolicyMixData;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class itm implements itd {
    private final xyc a;
    private itc b;
    private Looper c = Looper.getMainLooper();
    private final List d = new ArrayList();

    public itm(xyc xycVar) {
        this.a = xycVar;
    }

    @Override // defpackage.itd
    @ResultIgnorabilityUnspecified
    public final int a(int i, int i2, int i3) {
        AudioPolicyMixData audioPolicyMixData = new AudioPolicyMixData(i, i2, i3);
        this.d.add(audioPolicyMixData);
        return r1.size() - 1;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, qup] */
    @Override // defpackage.itd
    @ResultIgnorabilityUnspecified
    public final /* synthetic */ ite b() throws RemoteException {
        CreateAudioPolicyRequest createAudioPolicyRequest = new CreateAudioPolicyRequest((AudioPolicyMixData[]) this.d.toArray(new AudioPolicyMixData[0]));
        itc itcVar = this.b;
        return new itn(this.a.gu().w(createAudioPolicyRequest, new quc(), itcVar != null ? new qui(itcVar, this.c) : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.itd
    public final int c(yfq yfqVar) {
        if (yfqVar.isEmpty()) {
            return -1;
        }
        return a(((Integer) yfqVar.get(0)).intValue(), 12, 48000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.itd
    public final int d(yfq yfqVar, int i) {
        if (yfqVar.isEmpty()) {
            return -1;
        }
        return a(((Integer) yfqVar.get(0)).intValue(), 16, i);
    }

    @Override // defpackage.itd
    public final /* synthetic */ void e(itc itcVar) {
        this.b = itcVar;
    }

    @Override // defpackage.itd
    public final /* synthetic */ void f(Looper looper) {
        this.c = looper;
    }
}
