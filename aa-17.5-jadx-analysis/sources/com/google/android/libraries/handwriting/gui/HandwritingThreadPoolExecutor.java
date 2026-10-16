package com.google.android.libraries.handwriting.gui;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public class HandwritingThreadPoolExecutor<Params, Progress, Result> {

    public class HoneyCombAndBeyondExecutor<Pars, Prog, Res> {
        public HoneyCombAndBeyondExecutor(HandwritingThreadPoolExecutor handwritingThreadPoolExecutor) {
            handwritingThreadPoolExecutor.getClass();
        }

        public void execute(AsyncTask<Pars, Prog, Res> asyncTask, Pars... parsArr) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, parsArr);
        }
    }

    public void execute(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        new HoneyCombAndBeyondExecutor(this).execute(asyncTask, paramsArr);
    }
}
