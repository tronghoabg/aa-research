package defpackage;

import android.os.Bundle;
import com.google.android.libraries.surveys.internal.model.Answer;

/* loaded from: classes3.dex */
public final class wkb {
    public final abyn a;
    public final Answer b;
    public final boolean c;
    public final Integer d;
    public final String e;
    public final abzc f;
    public final int g;
    public final Integer h;
    public final whc i;
    public final boolean j;
    public final boolean k;
    public final who l;
    public final Bundle m;

    public wkb(abyn abynVar, Answer answer, boolean z, Integer num, String str, abzc abzcVar, int i, Integer num2, whc whcVar, boolean z2, boolean z3, who whoVar, Bundle bundle) {
        this.a = abynVar;
        this.b = answer;
        this.c = z;
        this.d = num;
        this.e = str;
        this.f = abzcVar;
        this.g = i;
        this.h = num2;
        this.i = whcVar;
        this.j = z2;
        this.k = z3;
        this.l = whoVar;
        this.m = bundle;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wkb) {
            wkb wkbVar = (wkb) obj;
            if (this.a.equals(wkbVar.a) && this.b.equals(wkbVar.b) && this.c == wkbVar.c && ((num = this.d) != null ? num.equals(wkbVar.d) : wkbVar.d == null) && this.e.equals(wkbVar.e) && this.f.equals(wkbVar.f) && this.g == wkbVar.g && ((num2 = this.h) != null ? num2.equals(wkbVar.h) : wkbVar.h == null) && this.i.equals(wkbVar.i) && this.j == wkbVar.j && this.k == wkbVar.k && this.l.equals(wkbVar.l) && this.m.equals(wkbVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Integer num = this.d;
        int iHashCode2 = ((((((((((((iHashCode * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        Integer num2 = this.h;
        return this.m.hashCode() ^ ((((((((((iHashCode2 ^ (num2 != null ? num2.hashCode() : 0)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003);
    }

    public final String toString() {
        Bundle bundle = this.m;
        who whoVar = this.l;
        whc whcVar = this.i;
        abzc abzcVar = this.f;
        Answer answer = this.b;
        return "SurveyQuestionsContainerViewArgs{surveyPayload=" + String.valueOf(this.a) + ", answer=" + String.valueOf(answer) + ", isSubmitting=" + this.c + ", ignoreFirstQuestion=false, logoResId=" + this.d + ", triggerId=" + this.e + ", surveySession=" + String.valueOf(abzcVar) + ", startingQuestionIndex=" + this.g + ", currentItem=" + this.h + ", surveyCompletionStyle=" + String.valueOf(whcVar) + ", hideCloseButton=" + this.j + ", keepNextButtonForLastQuestion=" + this.k + ", surveyStyle=" + String.valueOf(whoVar) + ", singleSelectOrdinalAnswerMappings=" + String.valueOf(bundle) + "}";
    }

    public wkb() {
        throw null;
    }
}
