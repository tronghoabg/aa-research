package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public class HandwritingThreadPoolExecutor<Params, Progress, Result> {

    public class HoneyCombAndBeyondExecutor<Pars, Prog, Res> {
        public HoneyCombAndBeyondExecutor(com.google.android.libraries.handwriting.gui.HandwritingThreadPoolExecutor handwritingThreadPoolExecutor) {
            handwritingThreadPoolExecutor.getClass();
        }

        public void execute(android.os.AsyncTask<Pars, Prog, Res> asyncTask, Pars... parsArr) {
            asyncTask.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, parsArr);
        }
    }

    public void execute(android.os.AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        new com.google.android.libraries.handwriting.gui.HandwritingThreadPoolExecutor.HoneyCombAndBeyondExecutor(this).execute(asyncTask, paramsArr);
    }
}
