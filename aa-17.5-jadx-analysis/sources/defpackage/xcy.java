package defpackage;

import android.os.AsyncTask;
import android.util.Pair;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.gui.AsyncTaskResult;
import com.google.android.projection.gearhead.input.HwrView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class xcy extends AsyncTask {
    final StrokeList a;
    final /* synthetic */ HwrView b;

    public xcy(HwrView hwrView, StrokeList strokeList) {
        this.b = hwrView;
        this.a = strokeList;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            HandwritingRecognizer handwritingRecognizer = this.b.b;
            StrokeList strokeList = this.a;
            RecognitionResult recognitionResultRecognize = handwritingRecognizer.recognize(strokeList, HandwritingRecognizer.CancelStruct.UNCANCELABLE);
            recognitionResultRecognize.setStrokes(strokeList);
            return new AsyncTaskResult(recognitionResultRecognize);
        } catch (HandwritingRecognizer.RecognitionFailedException e) {
            return new AsyncTaskResult((Exception) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        ArrayList<Pair> arrayList;
        AsyncTaskResult asyncTaskResult = (AsyncTaskResult) obj;
        RecognitionResult recognitionResult = (RecognitionResult) asyncTaskResult.result;
        boolean z = false;
        if (recognitionResult != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < Math.min(recognitionResult.numResult(), 10); i++) {
                arrayList.add(new Pair(Float.valueOf(recognitionResult.get(i).score), recognitionResult.get(i).word));
            }
            if (recognitionResult.numResult() > 0) {
                z = true;
            }
        } else {
            arrayList = null;
        }
        ykd ykdVar = this.b.m;
        yph yphVar = xcs.a;
        ((ype) yphVar.l().ai((char) 10112)).y("onRecognition success=%b", Boolean.valueOf(z));
        for (Pair pair : arrayList) {
            ((ype) yphVar.l().ai(10113)).M("score=%g text=%s", pair.first, pair.second);
        }
        if (z) {
            xcs xcsVar = (xcs) ykdVar.a;
            ebf.j().g(((xdv) xcsVar.n.a).f(), xcsVar.a(arrayList), lgp.a().c());
        }
        super.onPostExecute(asyncTaskResult);
    }
}
