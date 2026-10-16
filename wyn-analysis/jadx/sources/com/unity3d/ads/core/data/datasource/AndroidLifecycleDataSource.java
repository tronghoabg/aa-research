package com.unity3d.ads.core.data.datasource;

import Ef.E;
import Ef.H;
import Fe.e;
import Hf.InterfaceC0592c0;
import Hf.e0;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.J;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLifecycleDataSource;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Landroidx/lifecycle/t;", "<init>", "()V", "Lef/C;", "registerAppLifecycle", "", "appIsForeground", "()Z", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m;", "event", "onStateChanged", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V", "LHf/c0;", "_appActive", "LHf/c0;", "LHf/v0;", "appActive", "LHf/v0;", "getAppActive", "()LHf/v0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, InterfaceC1455t {

    @NotNull
    private final InterfaceC0592c0 _appActive;

    @NotNull
    private final v0 appActive;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1449m.values().length];
            try {
                iArr[EnumC1449m.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1449m.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        int label;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return AndroidLifecycleDataSource.this.new AnonymousClass1(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            J j8 = J.f18589i;
            J.f18589i.f18595f.a(AndroidLifecycleDataSource.this);
            return C2515C.f34653a;
        }
    }

    public AndroidLifecycleDataSource() {
        x0 x0VarC = k0.c(Boolean.TRUE);
        this._appActive = x0VarC;
        this.appActive = new e0(x0VarC);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        H.D(H.e(), null, new AnonymousClass1(null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    @NotNull
    public v0 getAppActive() {
        return this.appActive;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public void onStateChanged(@NotNull InterfaceC1457v source, @NotNull EnumC1449m event) {
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(event, "event");
        InterfaceC0592c0 interfaceC0592c0 = this._appActive;
        int i5 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean zBooleanValue = true;
        if (i5 == 1) {
            zBooleanValue = false;
        } else if (i5 != 2) {
            zBooleanValue = ((Boolean) getAppActive().getValue()).booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        x0 x0Var = (x0) interfaceC0592c0;
        x0Var.getClass();
        x0Var.k(null, boolValueOf);
    }
}
