package androidx.biometric;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PromptContentViewWithMoreOptionsButton implements PromptContentView {
    private final String mDescription;

    /* compiled from: WazeSource */
    public final class Builder {
        private String mDescription;

        public PromptContentViewWithMoreOptionsButton build() {
            return new PromptContentViewWithMoreOptionsButton(this.mDescription);
        }

        public Builder setDescription(String str) {
            this.mDescription = str;
            return this;
        }
    }

    private PromptContentViewWithMoreOptionsButton(String str) {
        this.mDescription = str;
    }

    public String getDescription() {
        return this.mDescription;
    }
}
