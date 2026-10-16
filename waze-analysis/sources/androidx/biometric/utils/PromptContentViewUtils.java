package androidx.biometric.utils;

import android.content.DialogInterface;
import android.hardware.biometrics.PromptContentView;
import android.hardware.biometrics.PromptContentViewWithMoreOptionsButton;
import android.hardware.biometrics.PromptVerticalListContentView;
import androidx.biometric.PromptContentItem;
import androidx.biometric.PromptContentItemBulletedText;
import androidx.biometric.PromptContentItemPlainText;
import androidx.biometric.PromptContentViewWithMoreOptionsButton;
import androidx.biometric.PromptVerticalListContentView;
import androidx.biometric.utils.PromptContentViewUtils;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class PromptContentViewUtils {

    /* compiled from: WazeSource */
    class Api35Impl {
        private Api35Impl() {
        }

        static PromptContentView createPromptContentViewWithMoreOptionsButton(PromptContentViewWithMoreOptionsButton promptContentViewWithMoreOptionsButton, Executor executor, DialogInterface.OnClickListener onClickListener) {
            PromptContentViewWithMoreOptionsButton.Builder builder = new PromptContentViewWithMoreOptionsButton.Builder();
            if (promptContentViewWithMoreOptionsButton.getDescription() != null) {
                builder.setDescription(promptContentViewWithMoreOptionsButton.getDescription());
            }
            builder.setMoreOptionsButtonListener(executor, onClickListener);
            return builder.build();
        }

        static PromptContentView createPromptVerticalListContentView(PromptVerticalListContentView promptVerticalListContentView) {
            final PromptVerticalListContentView.Builder builder = new PromptVerticalListContentView.Builder();
            if (promptVerticalListContentView.getDescription() != null) {
                builder.setDescription(promptVerticalListContentView.getDescription());
            }
            Iterable$EL.forEach(promptVerticalListContentView.getListItems(), new Consumer() { // from class: androidx.biometric.utils.PromptContentViewUtils$Api35Impl$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PromptContentViewUtils.Api35Impl.lambda$createPromptVerticalListContentView$0(builder, (PromptContentItem) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return builder.build();
        }

        static /* synthetic */ void lambda$createPromptVerticalListContentView$0(PromptVerticalListContentView.Builder builder, PromptContentItem promptContentItem) {
            if (promptContentItem instanceof PromptContentItemPlainText) {
                builder.addListItem(new android.hardware.biometrics.PromptContentItemPlainText(((PromptContentItemPlainText) promptContentItem).getText()));
            } else if (promptContentItem instanceof PromptContentItemBulletedText) {
                builder.addListItem(new android.hardware.biometrics.PromptContentItemBulletedText(((PromptContentItemBulletedText) promptContentItem).getText()));
            }
        }
    }

    private PromptContentViewUtils() {
    }

    public static PromptContentView wrapForBiometricPrompt(androidx.biometric.PromptContentView promptContentView, Executor executor, DialogInterface.OnClickListener onClickListener) {
        if (promptContentView == null) {
            return null;
        }
        if (promptContentView instanceof androidx.biometric.PromptVerticalListContentView) {
            return Api35Impl.createPromptVerticalListContentView((androidx.biometric.PromptVerticalListContentView) promptContentView);
        }
        if (promptContentView instanceof androidx.biometric.PromptContentViewWithMoreOptionsButton) {
            return Api35Impl.createPromptContentViewWithMoreOptionsButton((androidx.biometric.PromptContentViewWithMoreOptionsButton) promptContentView, executor, onClickListener);
        }
        return null;
    }
}
