package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.projection.gearhead.R;
import j$.util.DesugarDate;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
final class okc extends oji {
    final /* synthetic */ okd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okc(okd okdVar) {
        super(okdVar);
        this.a = okdVar;
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return xvy.a;
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.a.getString(R.string.connection_session_overview_title);
    }

    @Override // defpackage.ojn
    public final String c() {
        okd okdVar = this.a;
        Date dateFrom = DesugarDate.from(okdVar.b.instant());
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "EEEE, MMMM d");
        Context context = okdVar.a;
        return MessageFormat.format(context.getString(R.string.connection_session_overview_message), DateFormat.format(bestDateTimePattern, dateFrom), DateFormat.getTimeFormat(context).format(dateFrom));
    }

    @Override // defpackage.ojn
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ojn
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.ojn
    public final xxh p() {
        return xxh.h(10);
    }
}
