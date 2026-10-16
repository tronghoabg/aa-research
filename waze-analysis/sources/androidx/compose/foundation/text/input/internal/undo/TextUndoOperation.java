package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmAndAndroidKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextUndoOperation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextUndoOperation, Object> Saver = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextUndoOperation restore(Object obj) {
            x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            x.d(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = list.get(2);
            x.d(obj4, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj4;
            Object obj5 = list.get(3);
            x.d(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            x.d(obj6, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = TextRangeKt.TextRange(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            x.d(obj7, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            x.d(obj8, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange2 = TextRangeKt.TextRange(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            x.d(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new TextUndoOperation(iIntValue, (String) obj3, str, jTextRange, jTextRange2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextUndoOperation textUndoOperation) {
            return i.i(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.m10546getStartimpl(textUndoOperation.m3771getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m10541getEndimpl(textUndoOperation.m3771getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m10546getStartimpl(textUndoOperation.m3770getPostSelectiond9O1mEE())), Integer.valueOf(TextRange.m10541getEndimpl(textUndoOperation.m3770getPostSelectiond9O1mEE())), Long.valueOf(textUndoOperation.getTimeInMillis()));
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;
    private final String postText;
    private final long preSelection;
    private final String preText;
    private final TextEditType textEditType;
    private final long timeInMillis;

    private TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z) {
        this.index = i2;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j2;
        this.postSelection = j3;
        this.timeInMillis = j4;
        this.canMerge = z;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.textEditType = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete : TextEditType.Insert;
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    public final TextDeleteType getDeletionType() {
        if (this.textEditType != TextEditType.Delete) {
            return TextDeleteType.NotByUser;
        }
        if (!TextRange.m10540getCollapsedimpl(this.postSelection)) {
            return TextDeleteType.NotByUser;
        }
        long j2 = this.preSelection;
        boolean zM10540getCollapsedimpl = TextRange.m10540getCollapsedimpl(j2);
        long j3 = this.postSelection;
        if (zM10540getCollapsedimpl) {
            return TextRange.m10546getStartimpl(j2) > TextRange.m10546getStartimpl(j3) ? TextDeleteType.Start : TextDeleteType.End;
        }
        if (TextRange.m10546getStartimpl(j2) == TextRange.m10546getStartimpl(j3)) {
            if (TextRange.m10546getStartimpl(j2) == this.index) {
                return TextDeleteType.Inner;
            }
        }
        return TextDeleteType.NotByUser;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m3770getPostSelectiond9O1mEE() {
        return this.postSelection;
    }

    public final String getPostText() {
        return this.postText;
    }

    /* renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m3771getPreSelectiond9O1mEE() {
        return this.preSelection;
    }

    public final String getPreText() {
        return this.preText;
    }

    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z, o oVar) {
        this(i2, str, str2, j2, j3, j4, z);
    }

    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z, int i3, o oVar) {
        this(i2, str, str2, j2, j3, (i3 & 32) != 0 ? UndoManager_jvmAndAndroidKt.timeNowMillis() : j4, (!((i3 & 64) == 0)) | z, null);
    }
}
