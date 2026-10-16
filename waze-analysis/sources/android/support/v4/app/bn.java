package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bn extends ActivityResultContract {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequestBuild = (IntentSenderRequest) obj;
        Intent intent = new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
        Intent fillInIntent = intentSenderRequestBuild.getFillInIntent();
        if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
            intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
            fillInIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSenderRequestBuild.getIntentSender());
                builder.setFillInIntent(null);
                builder.setFlags(intentSenderRequestBuild.getFlagsValues(), intentSenderRequestBuild.getFlagsMask());
                intentSenderRequestBuild = builder.build();
            }
        }
        intent.putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequestBuild);
        if (bv.aM(2)) {
            intent.toString();
            Log.v("FragmentManager", "CreateIntent created the following intent: ".concat(intent.toString()));
        }
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final /* synthetic */ Object parseResult(int i2, Intent intent) {
        return new ActivityResult(i2, intent);
    }
}
