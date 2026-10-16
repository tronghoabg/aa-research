package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BugreportManager$BugreportCallback;
import com.google.android.apps.auto.components.bugreport.BugreportHandlerActivity;
import com.google.android.apps.auto.components.bugreport.BugreportRequester;
import j$.time.Instant;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class kgf extends BugreportManager$BugreportCallback {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;
    final /* synthetic */ File c;

    public kgf(Context context, Intent intent, File file) {
        this.a = context;
        this.b = intent;
        this.c = file;
    }

    public final void onError(int i) {
        ((ype) ((ype) BugreportRequester.a.h()).ai((char) 3016)).w("Failed to retrieve bug report: %d", i);
        Context context = this.a;
        BugreportRequester.h(context, yzy.CK);
        context.getMainExecutor().execute(new kea(context, 9));
    }

    public final void onFinished() {
        yfq yfqVarG;
        yph yphVar = BugreportRequester.a;
        ((ype) ((ype) yphVar.f()).ai((char) 3017)).u("Successfully retrieved bug report, handling it");
        Intent intent = this.b;
        long longExtra = intent.getLongExtra("EXTRA_HAPPENED_TIME", -1L);
        yfl yflVar = new yfl(4);
        Context context = this.a;
        if (longExtra == -1) {
            ((ype) ((ype) yphVar.f()).ai((char) 3021)).u("No extra happened time found");
            yfqVarG = yflVar.g();
        } else {
            String strC = kgi.c(Instant.ofEpochMilli(longExtra));
            File[] fileArrListFiles = new File(context.getCacheDir(), "bugreports").listFiles();
            if (fileArrListFiles == null) {
                ((ype) ((ype) yphVar.f()).ai((char) 3020)).u("No files found");
                yfqVarG = yflVar.g();
            } else {
                Pattern patternCompile = Pattern.compile("display_(\\d+)\\.");
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    if (name.contains(strC)) {
                        Matcher matcher = patternCompile.matcher(name);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                yflVar.i(strGroup);
                            } else {
                                ((ype) ((ype) yphVar.f()).ai((char) 3019)).y("Couldn't find carDisplayId in filename %s", name);
                            }
                        }
                    }
                }
                yfqVarG = yflVar.g();
            }
        }
        context.startActivity(new Intent(context, (Class<?>) BugreportHandlerActivity.class).addFlags(268435456).putExtra("android.intent.extra.SUBJECT", intent.getStringExtra("android.intent.extra.SUBJECT")).putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(Collections.singletonList(duq.a(context, "com.google.android.apps.auto.components.bugreport.fileprovider", this.c)))).putStringArrayListExtra("EXTRA_CAR_DISPLAY_IDS", new ArrayList<>(yfqVarG)).putExtra("EXTRA_HAPPENED_TIME", intent.getLongExtra("EXTRA_HAPPENED_TIME", -1L)));
    }
}
