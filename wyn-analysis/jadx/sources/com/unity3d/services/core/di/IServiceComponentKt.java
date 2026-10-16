package com.unity3d.services.core.di;

import ef.EnumC2526j;
import ef.InterfaceC2525i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "Lcom/unity3d/services/core/di/IServiceComponent;", "", "named", "get", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "Lef/j;", "mode", "Lef/i;", "inject", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;Lef/j;)Lef/i;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IServiceComponentKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // tf.a
        @NotNull
        public final T invoke() {
            this.$this_inject.getServiceProvider().getRegistry();
            AbstractC3340k.l();
            throw null;
        }
    }

    public static final <T> T get(IServiceComponent iServiceComponent, String named) {
        AbstractC3340k.e(iServiceComponent, "<this>");
        AbstractC3340k.e(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        AbstractC3340k.l();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String named, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(iServiceComponent, "<this>");
        AbstractC3340k.e(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        AbstractC3340k.l();
        throw null;
    }

    public static final <T> InterfaceC2525i inject(IServiceComponent iServiceComponent, String named, EnumC2526j mode) {
        AbstractC3340k.e(iServiceComponent, "<this>");
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(mode, "mode");
        AbstractC3340k.l();
        throw null;
    }

    public static InterfaceC2525i inject$default(IServiceComponent iServiceComponent, String named, EnumC2526j mode, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        if ((i5 & 2) != 0) {
            mode = EnumC2526j.f34669c;
        }
        AbstractC3340k.e(iServiceComponent, "<this>");
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(mode, "mode");
        AbstractC3340k.l();
        throw null;
    }
}
