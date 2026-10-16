package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class EmojiEditTextHelper {
    private final EditText mEditText;
    private int mEmojiReplaceStrategy;
    private int mMaxEmojiCount;
    private final EmojiTextWatcher mTextWatcher;

    public EmojiEditTextHelper(EditText editText, boolean z) {
        this.mMaxEmojiCount = Integer.MAX_VALUE;
        this.mEmojiReplaceStrategy = 0;
        Preconditions.checkNotNull(editText, "editText cannot be null");
        this.mEditText = editText;
        EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText, z);
        this.mTextWatcher = emojiTextWatcher;
        editText.addTextChangedListener(emojiTextWatcher);
        editText.setEditableFactory(EmojiEditableFactory.getInstance());
    }

    public int getEmojiReplaceStrategy() {
        return this.mEmojiReplaceStrategy;
    }

    public KeyListener getKeyListener(KeyListener keyListener) {
        if (!(keyListener instanceof EmojiKeyListener)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new EmojiKeyListener(keyListener);
            }
        }
        return keyListener;
    }

    public int getMaxEmojiCount() {
        return this.mMaxEmojiCount;
    }

    public boolean isEnabled() {
        return this.mTextWatcher.isEnabled();
    }

    public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(this.mEditText, inputConnection, editorInfo);
    }

    public void setEmojiReplaceStrategy(int i2) {
        this.mEmojiReplaceStrategy = i2;
        this.mTextWatcher.setEmojiReplaceStrategy(i2);
    }

    public void setEnabled(boolean z) {
        this.mTextWatcher.setEnabled(z);
    }

    public void setMaxEmojiCount(int i2) {
        Preconditions.checkArgumentNonnegative(i2, "maxEmojiCount should be greater than 0");
        this.mMaxEmojiCount = i2;
        this.mTextWatcher.setMaxEmojiCount(i2);
    }

    public EmojiEditTextHelper(EditText editText) {
        this(editText, true);
    }
}
