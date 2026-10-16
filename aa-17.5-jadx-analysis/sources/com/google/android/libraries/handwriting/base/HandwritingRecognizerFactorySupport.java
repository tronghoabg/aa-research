package com.google.android.libraries.handwriting.base;

import android.content.Context;
import android.util.Log;
import defpackage.abww;

/* loaded from: classes3.dex */
public class HandwritingRecognizerFactorySupport {
    private static final String TAG = "HWRFactorySupport";

    public static class CloudOnlyRecognizerWasNotAcceptedException extends Exception {
    }

    public static class NeedToDownloadFilesException extends Exception {
    }

    public static HandwritingRecognizer createRecognizer(abww abwwVar, Context context, boolean z) throws Exception {
        boolean zHaveAllFiles = OnDeviceSpecUtils.haveAllFiles(context, abwwVar);
        boolean zCanDoOnDevice = OnDeviceSpecUtils.canDoOnDevice(abwwVar);
        Log.i(TAG, "haveAllFiles: " + zHaveAllFiles + " canDoOnDevice: " + zCanDoOnDevice + " userWantsCloudOnlyRecognizer: " + z);
        if (zCanDoOnDevice) {
            if (!zHaveAllFiles) {
                throw new NeedToDownloadFilesException();
            }
        } else if (!z) {
            throw new CloudOnlyRecognizerWasNotAcceptedException();
        }
        return HandwritingRecognizerFactory.create(abwwVar, context);
    }
}
