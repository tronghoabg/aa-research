package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import java.util.Locale;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class r9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public r9(t9 t9Var, boolean z) {
        this.c = t9Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) this.c;
                if (t9Var.g != null && t9Var.e()) {
                    rc rcVar = t9Var.g;
                    Context context = rcVar.a;
                    if (!rcVar.d) {
                        try {
                            rcVar.b();
                            if (rcVar.c == null) {
                                SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context);
                                rcVar.c = speechRecognizerCreateSpeechRecognizer;
                                speechRecognizerCreateSpeechRecognizer.setRecognitionListener(rcVar.e);
                            }
                            String languageTag = Locale.getDefault().toLanguageTag();
                            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                            intent.putExtra("android.speech.extra.LANGUAGE", languageTag);
                            intent.putExtra("android.speech.extra.LANGUAGE_PREFERENCE", languageTag);
                            intent.putExtra("android.speech.extra.ONLY_RETURN_LANGUAGE_PREFERENCE", false);
                            intent.putExtra("android.speech.extra.PREFER_OFFLINE", false);
                            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                            intent.putExtra("android.speech.extra.MAX_RESULTS", 3);
                            intent.putExtra("calling_package", context.getPackageName());
                            rcVar.d = true;
                            SystemClock.elapsedRealtime();
                            rcVar.c.startListening(intent);
                        } catch (Exception e) {
                            rcVar.d = false;
                            e.getMessage();
                            t9 t9Var2 = rcVar.b.a;
                            t9Var2.b();
                            if (t9Var2.j) {
                                t9Var2.j = false;
                                t9Var2.b.y();
                            }
                            t9Var2.i("Không mở được micro", true);
                        }
                    }
                    boolean z = this.b;
                    Handler handler = t9Var.c;
                    s9 s9Var = t9Var.a;
                    if (s9Var != null) {
                        handler.removeCallbacks(s9Var);
                        t9Var.a = null;
                    }
                    if (z) {
                        s9 s9Var2 = new s9(t9Var, 1);
                        t9Var.a = s9Var2;
                        handler.postDelayed(s9Var2, 5000L);
                        break;
                    }
                }
                break;
            default:
                yb ybVar = (yb) this.c;
                boolean z2 = this.b;
                if (ybVar == null || !ybVar.b) {
                    dc.l++;
                } else {
                    dc.l = 0;
                }
                if (ybVar != null) {
                    if (ybVar.a == null) {
                        if (ybVar.b) {
                            dc.c(-1);
                            break;
                        }
                    } else if (!z2 && w7.a > 0) {
                        dc.c(w7.a);
                        break;
                    } else {
                        dc.c(ybVar.a.intValue());
                        break;
                    }
                }
                break;
        }
    }

    public r9(cc ccVar, yb ybVar, boolean z) {
        this.c = ybVar;
        this.b = z;
    }
}
