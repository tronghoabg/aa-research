package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.widget.ImageView;
import com.google.android.apps.auto.components.system.transcription.TranscriptionFragment;
import com.google.android.apps.auto.components.system.transcription.TranscriptionTextView;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class odg {
    public static final yph a = yph.c("GH.TranscriptionCtrl");
    public qjm b;
    private noh c = null;

    public static boolean c(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final TranscriptionFragment a() {
        noh nohVar;
        CarWindowLayoutParams carWindowLayoutParamsA;
        if (!lbh.d().gN()) {
            ((ype) ((ype) a.h()).ai((char) 5566)).u("Can't show the transcription as lifetime not yet started.");
            return null;
        }
        if (!lal.a().b()) {
            ((ype) ((ype) a.h()).ai((char) 5565)).u("Tries to show transcription without enabling voice plate 2.0.");
            return null;
        }
        try {
            nohVar = this.c;
        } catch (qrz | qsa e) {
            e = e;
        }
        try {
            if (nohVar != null) {
                TranscriptionFragment transcriptionFragment = (TranscriptionFragment) nohVar.a();
                if (transcriptionFragment != null && TranscriptionFragment.c()) {
                    return transcriptionFragment;
                }
                b();
                return null;
            }
            yph yphVar = a;
            ((ype) ((ype) yphVar.e()).ai(5563)).u("Creating new transcriptionFragmentHost");
            TranscriptionFragment transcriptionFragment2 = new TranscriptionFragment();
            ((ype) ((ype) yphVar.f()).ai(5564)).y("fragment.shouldDisplayTranscription() %b", Boolean.valueOf(TranscriptionFragment.c()));
            if (!TranscriptionFragment.c()) {
                return null;
            }
            qrn qrnVarE = kio.b().e();
            mki.a.g();
            sab sabVarV = ols.v(qrnVarE, CarDisplayId.a);
            nso nsoVarB = nsr.c().b();
            boolean zJ = nsoVarB.J();
            Rect rectA = sabVarV.d().a();
            int i = zJ ? R.anim.transcription_open_from_right : R.anim.transcription_open_from_left;
            if (TranscriptionFragment.c()) {
                Context context = mki.a.c;
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.densityDpi = sabVarV.a();
                Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
                nsn nsnVar = nsn.k;
                Rect rectH = nsoVarB.h(nsnVar);
                if (rectH == null) {
                    rectH = new Rect();
                }
                Rect rectH2 = nsoVarB.h(nsn.a);
                if (rectH2 == null) {
                    rectH2 = new Rect();
                }
                int dimension = (int) contextCreateConfigurationContext.getResources().getDimension(R.dimen.transcription_height);
                int dimension2 = (int) contextCreateConfigurationContext.getResources().getDimension(R.dimen.transcription_view_margin);
                int iWidth = ((zJ && ldz.a().c(qrnVarE)) ? rectH2.width() - (rectH.width() / 2) : rectH2.width() + (rectH.width() / 2)) - dimension2;
                Rect rectH3 = nsoVarB.h(nsnVar);
                if (rectH3 == null) {
                    rectH3 = new Rect();
                }
                int dimension3 = (int) contextCreateConfigurationContext.getResources().getDimension(R.dimen.transcription_view_left_margin);
                int i2 = acrz.d() ? rectH3.left + dimension3 : rectA.left + dimension3;
                if (zJ) {
                    i2 = rectH2.left + dimension2;
                }
                qsw qswVar = new qsw(iWidth, dimension, nsr.c().a(sabVarV.c).v());
                qswVar.a = i2;
                qswVar.b = (rectH2.bottom - dimension) - ((int) contextCreateConfigurationContext.getResources().getDimension(R.dimen.transcription_view_bottom_margin));
                qswVar.g = 491;
                qswVar.l = true;
                qswVar.b(i);
                qswVar.c(R.anim.transcription_on_close);
                qswVar.m = 192;
                carWindowLayoutParamsA = qswVar.a();
            } else {
                qsw qswVar2 = new qsw(0, 0, nsr.c().a(sabVarV.c).v());
                qswVar2.a = rectA.left;
                qswVar2.b = rectA.top;
                qswVar2.g = 491;
                qswVar2.l = true;
                qswVar2.b(i);
                qswVar2.c(R.anim.transcription_on_close);
                qswVar2.m = 192;
                carWindowLayoutParamsA = qswVar2.a();
            }
            nog nogVarB = nsh.b(carWindowLayoutParamsA, "com.google.android.projection.gearhead/GhTranscription", transcriptionFragment2, lbh.d());
            nogVarB.e = this;
            this.c = nogVarB.a();
            return transcriptionFragment2;
        } catch (qrz e2) {
            e = e2;
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 5562)).u("Unable to show transcription.");
            return null;
        } catch (qsa e3) {
            e = e3;
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 5562)).u("Unable to show transcription.");
            return null;
        }
    }

    public final void b() {
        noh nohVar = this.c;
        if (nohVar == null) {
            ((ype) ((ype) a.e()).ai((char) 5561)).u("TranscriptionFragmentHost not created.");
            return;
        }
        TranscriptionFragment transcriptionFragment = (TranscriptionFragment) nohVar.a();
        if (transcriptionFragment != null) {
            TranscriptionTextView transcriptionTextView = transcriptionFragment.a;
            if (transcriptionTextView != null) {
                transcriptionTextView.f = "";
                transcriptionTextView.c.cancel();
                transcriptionTextView.setText("");
            }
            ImageView imageView = transcriptionFragment.b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        noh nohVar2 = this.c;
        nohVar2.getClass();
        nohVar2.d();
        this.c = null;
    }
}
