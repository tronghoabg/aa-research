package com.waze.speech;

import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.bs;
import h.ab;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;
import okhttp3.ae;
import okhttp3.ah;
import okhttp3.ai;
import okhttp3.ak;
import okhttp3.as;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final bs f40436a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40437b;

    public g(bs bsVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bsVar, "conversationalReportingSupportedLocaleState");
        h.g.b.x.f(eVar, "logger");
        this.f40436a = bsVar;
        this.f40437b = eVar;
    }

    public static final /* synthetic */ void c(g gVar, String str, CompletableDeferred completableDeferred) {
        List<Alternative> alternative;
        Object obj;
        String transcript;
        Item item = (Item) h.a.i.R(((SpeechResult) new com.google.l.e().a().f(str, SpeechResult.class)).getResult());
        if (item != null && (alternative = item.getAlternative()) != null) {
            Iterator<T> it = alternative.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float confidence = ((Alternative) next).getConfidence();
                    do {
                        Object next2 = it.next();
                        float confidence2 = ((Alternative) next2).getConfidence();
                        int iCompare = Float.compare(confidence, confidence2);
                        if (iCompare < 0) {
                            confidence = confidence2;
                        }
                        if (iCompare < 0) {
                            next = next2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Alternative alternative2 = (Alternative) obj;
            if (alternative2 != null && (transcript = alternative2.getTranscript()) != null) {
                gVar.f40437b.a("returning result from speech api: ".concat(transcript));
                completableDeferred.a(new d(transcript));
                return;
            }
        }
        completableDeferred.a(c.f40432a);
        gVar.f40437b.b("no result in parsed json");
    }

    public final Object b(byte[] bArr, h.c.e eVar) {
        Object objA;
        ai aiVar = new ai(new ah());
        String strB = ConfigValues.CONFIG_VALUE_ASR_GOOGLE_SPEECH_API_KEY.b();
        CompletableDeferred completableDeferredJ = bo.j();
        try {
            g gVar = this;
            ak akVarI = new ak().d(new com.waze.shared_infra.coordinators.c((byte[]) null).l("Content-Type", "audio/L16; rate=16000").h()).i("https://www.google.com/speech-api/v2/recognize?key=" + strB + "&lang=" + this.f40436a.c() + "&client=com.waze.iphone.dictate&maxAlternatives=10&output=json");
            int i2 = ae.f55830a;
            aiVar.r(akVarI.f(as.c(bArr, kotlinx.b.a.b.A("audio/L16; rate=16000"), 6)).k()).d(new f(completableDeferredJ, this));
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f40437b.c("Call failed", thC);
            completableDeferredJ.a(b.f40431a);
        }
        return completableDeferredJ.c(eVar);
    }
}
