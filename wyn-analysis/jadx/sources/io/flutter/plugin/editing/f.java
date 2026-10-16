package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import tc.j;
import vc.C4337a;

/* loaded from: classes5.dex */
public final class f implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final j f37050a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f37051b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f37052c;

    /* renamed from: d, reason: collision with root package name */
    public tc.g f37053d;

    public f(TextServicesManager textServicesManager, j jVar) {
        this.f37051b = textServicesManager;
        this.f37050a = jVar;
        jVar.f46015a = this;
    }

    public final void a(String str, String str2, tc.g gVar) {
        if (this.f37053d != null) {
            gVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f37053d = gVar;
        Locale localeA = C4337a.a(str);
        if (this.f37052c == null) {
            this.f37052c = this.f37051b.newSpellCheckerSession(null, localeA, this, true);
        }
        this.f37052c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f37053d.a(new ArrayList());
            this.f37053d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f37053d.a(new ArrayList());
            this.f37053d = null;
            return;
        }
        for (int i5 = 0; i5 < sentenceSuggestionsInfo.getSuggestionsCount(); i5++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i5);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap map = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i5);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i5) + offsetAt;
                map.put("startIndex", Integer.valueOf(offsetAt));
                map.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (int i10 = 0; i10 < suggestionsCount; i10++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i10);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z2 = true;
                    }
                }
                if (z2) {
                    map.put("suggestions", arrayList2);
                    arrayList.add(map);
                }
            }
        }
        this.f37053d.a(arrayList);
        this.f37053d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
