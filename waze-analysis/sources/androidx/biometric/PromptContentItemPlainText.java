package androidx.biometric;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PromptContentItemPlainText implements PromptContentItem {
    private final String mText;

    public PromptContentItemPlainText(String str) {
        this.mText = str;
    }

    public String getText() {
        return this.mText;
    }
}
