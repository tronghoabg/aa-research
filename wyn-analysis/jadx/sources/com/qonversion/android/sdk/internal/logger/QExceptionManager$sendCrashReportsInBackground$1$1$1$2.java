package com.qonversion.android.sdk.internal.logger;

import android.util.Log;
import com.qonversion.android.sdk.dto.QonversionError;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QExceptionManager$sendCrashReportsInBackground$1$1$1$2 extends AbstractC3343n implements l {
    public static final QExceptionManager$sendCrashReportsInBackground$1$1$1$2 INSTANCE = new QExceptionManager$sendCrashReportsInBackground$1$1$1$2();

    public QExceptionManager$sendCrashReportsInBackground$1$1$1$2() {
        super(1);
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((QonversionError) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull QonversionError error) {
        AbstractC3340k.e(error, "error");
        Log.e("QExceptionManager", "Failed to send crash report to API - " + error);
    }
}
