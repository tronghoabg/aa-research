package com.unity3d.ads.core.data.datasource;

import Hf.InterfaceC0592c0;
import Hf.k0;
import Hf.x0;
import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lef/C;", "invoke", "()V", "Landroid/content/Context;", "LHf/c0;", "", "isCollecting", "LHf/c0;", "", "_appSetIdFlow", "getAppSetId", "()Ljava/lang/String;", "appSetId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidAppSetIdDataSource {

    @NotNull
    private final InterfaceC0592c0 _appSetIdFlow;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final InterfaceC0592c0 isCollecting;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/appset/AppSetIdInfo;", "kotlin.jvm.PlatformType", "it", "Lef/C;", "invoke", "(Lcom/google/android/gms/appset/AppSetIdInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AppSetIdInfo) obj);
            return C2515C.f34653a;
        }

        public final void invoke(AppSetIdInfo appSetIdInfo) {
            String id2 = appSetIdInfo.getId();
            AbstractC3340k.d(id2, "it.id");
            x0 x0Var = (x0) AndroidAppSetIdDataSource.this._appSetIdFlow;
            x0Var.getClass();
            x0Var.k(null, id2);
        }
    }

    public AndroidAppSetIdDataSource(@NotNull Context applicationContext) {
        AbstractC3340k.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = k0.c(Boolean.FALSE);
        this._appSetIdFlow = k0.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(l tmp0, Object obj) {
        AbstractC3340k.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Nullable
    public final String getAppSetId() {
        return (String) ((x0) this._appSetIdFlow).getValue();
    }

    public final void invoke() {
        x0 x0Var;
        Object value;
        Boolean bool;
        InterfaceC0592c0 interfaceC0592c0 = this.isCollecting;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!x0Var.i(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            AppSet.getClient(this.applicationContext).getAppSetIdInfo().addOnSuccessListener(new a(new AnonymousClass2(), 0));
        } catch (Throwable unused) {
        }
    }
}
