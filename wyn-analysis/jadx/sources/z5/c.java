package z5;

import A5.m;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import q5.EnumC3870e;
import t5.C4114i;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48373a;

    /* renamed from: b, reason: collision with root package name */
    public final A5.d f48374b;

    /* renamed from: c, reason: collision with root package name */
    public final C4616a f48375c;

    public c(Context context, A5.d dVar, C4616a c4616a) {
        this.f48373a = context;
        this.f48374b = dVar;
        this.f48375c = c4616a;
    }

    public final void a(C4114i c4114i, int i5, boolean z2) {
        char c10;
        int i10;
        char c11 = 4;
        Context context = this.f48373a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c4114i.f45776a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC3870e enumC3870e = c4114i.f45778c;
        adler32.update(byteBufferAllocate.putInt(D5.a.a(enumC3870e)).array());
        byte[] bArr = c4114i.f45777b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (z2) {
            c10 = c11;
            i10 = 3;
        } else {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                c10 = c11;
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                i10 = 3;
                if (jobInfo.getId() != value) {
                    c11 = c10;
                } else if (i11 >= i5) {
                    ic.d.n("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c4114i);
                    return;
                }
            }
            c10 = c11;
            i10 = 3;
        }
        SQLiteDatabase sQLiteDatabaseA = ((m) this.f48374b).a();
        String strValueOf = String.valueOf(D5.a.a(enumC3870e));
        String str = c4114i.f45776a;
        Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C4616a c4616a = this.f48375c;
            Long l10 = lValueOf;
            builder.setMinimumLatency(c4616a.a(enumC3870e, jLongValue, i5));
            Set set = ((C4617b) c4616a.f48369b.get(enumC3870e)).f48372c;
            if (set.contains(d.f48376a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.f48378c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.f48377b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i5);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", D5.a.a(enumC3870e));
            if (bArr != null) {
                persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(c4616a.a(enumC3870e, jLongValue, i5));
            Integer numValueOf2 = Integer.valueOf(i5);
            Object[] objArr = new Object[5];
            objArr[0] = c4114i;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[i10] = l10;
            objArr[c10] = numValueOf2;
            String strB = ic.d.B("JobInfoScheduler");
            if (Log.isLoggable(strB, i10)) {
                Log.d(strB, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
