package androidx.compose.ui.window;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidPopup_androidKt$Popup$5$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$5$1(PopupLayout popupLayout, e<? super AndroidPopup_androidKt$Popup$5$1> eVar) {
        super(2, eVar);
        this.$popupLayout = popupLayout;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.$popupLayout, eVar);
        androidPopup_androidKt$Popup$5$1.L$0 = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AndroidPopup_androidKt$Popup$5$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x0038). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
            e.b.c.b(r5)
            goto L38
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L19:
            e.b.c.b(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.af r5 = (kotlinx.coroutines.af) r5
            r1 = r5
        L21:
            boolean r5 = kotlinx.coroutines.aj.j(r1)
            if (r5 == 0) goto L3f
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r5 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.INSTANCE
            h.g.a.l r5 = (h.g.a.l) r5
            r3 = r4
            h.c.e r3 = (h.c.e) r3
            r4.L$0 = r1
            r4.label = r2
            java.lang.Object r5 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r5, r3)
            if (r5 == r0) goto L3e
        L38:
            androidx.compose.ui.window.PopupLayout r5 = r4.$popupLayout
            r5.pollForLocationOnScreenChange()
            goto L21
        L3e:
            return r0
        L3f:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Long, ab> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Long l2) {
            l2.longValue();
            return ab.f48028a;
        }

        public final void invoke(long j2) {
        }
    }
}
