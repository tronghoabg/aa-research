package f5;

import Bf.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2563a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final String f34822a = "SpeechToTextPlugin";

    /* renamed from: b, reason: collision with root package name */
    public final Wa.h f34823b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34824c;

    public C2563a(Wa.h hVar, boolean z2) {
        this.f34823b = hVar;
        this.f34824c = z2;
    }

    public static String a(Locale locale) {
        String displayName = locale.getDisplayName();
        AbstractC3340k.d(displayName, "getDisplayName(...)");
        return locale.getLanguage() + '_' + locale.getCountry() + ':' + r.i0(displayName, ':', ' ');
    }

    public final void b(List list) {
        Locale locale = Locale.getDefault();
        ArrayList arrayList = new ArrayList();
        AbstractC3340k.b(locale);
        arrayList.add(a(locale));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!AbstractC3340k.a(locale.toLanguageTag(), str)) {
                    Locale localeForLanguageTag = Locale.forLanguageTag(str);
                    AbstractC3340k.b(localeForLanguageTag);
                    arrayList.add(a(localeForLanguageTag));
                }
            }
        }
        this.f34823b.a(arrayList);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(intent, "intent");
        String str = this.f34822a;
        boolean z2 = this.f34824c;
        if (z2) {
            Log.d(str, "Received extra language broadcast");
        }
        Bundle resultExtras = getResultExtras(true);
        if (resultExtras.containsKey("android.speech.extra.LANGUAGE_PREFERENCE")) {
            resultExtras.getString("android.speech.extra.LANGUAGE_PREFERENCE");
        }
        if (resultExtras.containsKey("android.speech.extra.SUPPORTED_LANGUAGES")) {
            if (z2) {
                Log.d(str, "Extra supported languages");
            }
            b(resultExtras.getStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES"));
        } else {
            if (z2) {
                Log.d(str, "No extra supported languages");
            }
            b(new ArrayList());
        }
    }
}
