package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import java.util.Locale;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DateInputKt$DateInputTextField$5$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ MutableState<TextFieldValue> $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateInputKt$DateInputTextField$5$1(Long l2, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, MutableState<TextFieldValue> mutableState, e<? super DateInputKt$DateInputTextField$5$1> eVar) {
        super(2, eVar);
        this.$initialDateMillis = l2;
        this.$calendarModel = calendarModel;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
        this.$text$delegate = mutableState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DateInputKt$DateInputTextField$5$1(this.$initialDateMillis, this.$calendarModel, this.$dateInputFormat, this.$locale, this.$text$delegate, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DateInputKt$DateInputTextField$5$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        Long l2 = this.$initialDateMillis;
        if (l2 != null) {
            CalendarModel calendarModel = this.$calendarModel;
            DateInputFormat dateInputFormat = this.$dateInputFormat;
            Locale locale = this.$locale;
            MutableState<TextFieldValue> mutableState = this.$text$delegate;
            String withPattern = calendarModel.formatWithPattern(l2.longValue(), dateInputFormat.getPatternWithoutDelimiters(), locale);
            mutableState.setValue(new TextFieldValue(withPattern, withPattern.length() == 0 ? TextRange.Companion.m10551getZerod9O1mEE() : TextRangeKt.TextRange(withPattern.length(), withPattern.length()), (TextRange) null, 4, (o) null));
        }
        return ab.f48028a;
    }
}
