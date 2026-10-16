package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class sri implements Runnable {
    private final Context a;
    private final long b;
    private final /* synthetic */ int c;
    private final thg d;

    public sri(Context context, thg thgVar, long j, int i) {
        this.c = i;
        this.a = context;
        this.d = thgVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listSingletonList;
        List listA;
        if (this.c == 0) {
            try {
                utl utlVar = new utl();
                utlVar.f();
                listSingletonList = this.d.b();
                try {
                    listSingletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(utlVar.d())));
                } catch (UnsupportedOperationException unused) {
                    ArrayList arrayList = new ArrayList(listSingletonList);
                    arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(utlVar.d())));
                    listSingletonList = arrayList;
                }
            } catch (Exception e) {
                Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                listSingletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            new suz(this.a, null).e(thg.m(listSingletonList), this.b);
            return;
        }
        Bundle bundle = new Bundle(1);
        try {
            utl utlVar2 = new utl();
            utlVar2.f();
            listA = this.d.a();
            File cacheDir = this.a.getCacheDir();
            if (!listA.isEmpty() && cacheDir != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(utlVar2.d()));
        } catch (Exception e2) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e2);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        new suz(this.a, null).d(FeedbackOptions.a(listA), bundle, this.b);
    }
}
