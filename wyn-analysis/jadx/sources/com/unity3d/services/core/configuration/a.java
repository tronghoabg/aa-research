package com.unity3d.services.core.configuration;

import Ef.E;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.configuration.InitializeThread;
import jf.InterfaceC3103c;
import tf.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HttpClientProvider f32723b;

    public /* synthetic */ a(HttpClientProvider httpClientProvider, int i5) {
        this.f32722a = i5;
        this.f32723b = httpClientProvider;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        E e7 = (E) obj;
        InterfaceC3103c interfaceC3103c = (InterfaceC3103c) obj2;
        switch (this.f32722a) {
            case 0:
                return InitializeThread.InitializeStateConfig.lambda$executeWithLoader$0(this.f32723b, e7, interfaceC3103c);
            case 1:
                return InitializeThread.InitializeStateDownloadWebView.lambda$execute$0(this.f32723b, e7, interfaceC3103c);
            default:
                return InitializeThread.InitializeStateLoadWeb.lambda$execute$0(this.f32723b, e7, interfaceC3103c);
        }
    }
}
