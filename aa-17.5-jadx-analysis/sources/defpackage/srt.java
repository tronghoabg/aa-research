package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class srt implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final /* synthetic */ int d;
    private final thg e;

    public srt(Context context, GoogleHelp googleHelp, thg thgVar, long j, int i) {
        this.d = i;
        this.a = context;
        this.b = googleHelp;
        this.e = thgVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listSingletonList;
        List listA;
        if (this.d == 0) {
            try {
                utl utlVar = new utl();
                utlVar.f();
                listSingletonList = this.e.b();
                try {
                    listSingletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(utlVar.d())));
                } catch (UnsupportedOperationException unused) {
                    ArrayList arrayList = new ArrayList(listSingletonList);
                    arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(utlVar.d())));
                    listSingletonList = arrayList;
                }
            } catch (Exception e) {
                Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                listSingletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            ssc sscVar = new ssc(this.a);
            GoogleHelp googleHelp = this.b;
            long j = this.c;
            sld sldVar = sscVar.i;
            srv srvVar = new srv(sldVar, thg.m(listSingletonList), j, googleHelp);
            sldVar.a(srvVar);
            soq.a(srvVar);
            return;
        }
        Bundle bundle = new Bundle(1);
        try {
            utl utlVar2 = new utl();
            utlVar2.f();
            listA = this.e.a();
            File cacheDir = this.a.getCacheDir();
            if (!listA.isEmpty() && cacheDir != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(utlVar2.d()));
        } catch (Exception e2) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e2);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        Context context = this.a;
        FeedbackOptions feedbackOptionsA = FeedbackOptions.a(listA);
        ssc sscVar2 = new ssc(context);
        GoogleHelp googleHelp2 = this.b;
        long j2 = this.c;
        sld sldVar2 = sscVar2.i;
        srx srxVar = new srx(sldVar2, feedbackOptionsA, bundle, j2, googleHelp2);
        sldVar2.a(srxVar);
        soq.a(srxVar);
    }
}
