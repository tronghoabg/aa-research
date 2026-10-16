package com.waze.settings;

import android.content.Context;
import com.waze.jni.protos.settings.SearchByVoiceDataProto;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class am implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36779a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36780b;

    public /* synthetic */ am(Object obj, int i2) {
        this.f36780b = i2;
        this.f36779a = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f36780b) {
            case 0:
                return ba.o((ba) this.f36779a, (Boolean) obj);
            case 1:
                return al.f((al) this.f36779a, (Boolean) obj);
            case 2:
                return ba.p((ba) this.f36779a, (Boolean) obj);
            case 3:
                return cg.d((cg) this.f36779a, (Integer) obj);
            case 4:
                return dc.u((dc) this.f36779a);
            case 5:
                return dc.o((dc) this.f36779a, (Boolean) obj);
            case 6:
                return dc.v((dc) this.f36779a);
            case 7:
                return ds.w((ds) this.f36779a, (SearchByVoiceDataProto) obj);
            case 8:
                return gr.r((gr) this.f36779a, (Context) obj);
            case 9:
                return gr.s((gr) this.f36779a, (Context) obj);
            default:
                return gr.t((gr) this.f36779a, (Context) obj);
        }
    }
}
