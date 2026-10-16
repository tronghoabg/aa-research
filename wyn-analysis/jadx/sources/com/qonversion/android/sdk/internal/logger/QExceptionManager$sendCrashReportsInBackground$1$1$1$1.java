package com.qonversion.android.sdk.internal.logger;

import android.content.Context;
import ef.C2515C;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QExceptionManager$sendCrashReportsInBackground$1$1$1$1 extends AbstractC3343n implements a {
    final /* synthetic */ String $filename;
    final /* synthetic */ QExceptionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QExceptionManager$sendCrashReportsInBackground$1$1$1$1(QExceptionManager qExceptionManager, String str) {
        super(0);
        this.this$0 = qExceptionManager;
        this.$filename = str;
    }

    @Override // tf.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m224invoke();
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m224invoke() {
        WeakReference weakReference = this.this$0.contextRef;
        if (weakReference == null) {
            AbstractC3340k.m("contextRef");
            throw null;
        }
        Context context = (Context) weakReference.get();
        if (context != null) {
            context.deleteFile(this.$filename);
        }
    }
}
