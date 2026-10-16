package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* loaded from: classes2.dex */
public final /* synthetic */ class srd implements smy {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ srd(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.smy
    public final void a(Object obj, Object obj2) {
        if (this.c != 0) {
            srh srhVar = (srh) obj;
            long j = this.a;
            ?? r11 = this.b;
            try {
                thg.o((Bundle) r11);
                srj srjVar = (srj) srhVar.v();
                Parcel parcelGh = srjVar.gh();
                ijp.g(parcelGh, r11);
                parcelGh.writeLong(j);
                srjVar.gj(4, parcelGh);
                ((nok) obj2).e(null);
                return;
            } catch (Exception e) {
                Log.e("gF_FeedbackClient", "Requesting to save the async feedback psd failed!", e);
                ((nok) obj2).d(new RemoteException("Internall Error: Failed to start feedback"));
                return;
            }
        }
        srh srhVar2 = (srh) obj;
        Object obj3 = this.b;
        try {
            thg thgVar = ((FeedbackOptions) obj3).u;
            long j2 = this.a;
            if (thgVar != null) {
                Context context = srhVar2.b;
                thg.q(new sri(context, thgVar, j2, 1));
                thg.q(new sri(context, thgVar, j2, 0));
            }
            thg.p((FeedbackOptions) obj3);
            ErrorReport errorReport = new ErrorReport((FeedbackOptions) obj3, srhVar2.a.getCacheDir());
            srj srjVar2 = (srj) srhVar2.v();
            Parcel parcelGh2 = srjVar2.gh();
            ijp.g(parcelGh2, errorReport);
            parcelGh2.writeLong(j2);
            srjVar2.gk(6, parcelGh2);
            ((nok) obj2).e(null);
        } catch (RemoteException e2) {
            Log.e("gF_FeedbackClient", "Failed to start feedback", e2);
            ((nok) obj2).d(new RemoteException("Internall Error: Failed to start feedback"));
        }
    }
}
