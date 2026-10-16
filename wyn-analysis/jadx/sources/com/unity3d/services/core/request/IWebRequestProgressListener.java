package com.unity3d.services.core.request;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IWebRequestProgressListener {
    void onRequestProgress(String str, long j8, long j10);

    void onRequestStart(String str, long j8, int i5, Map<String, List<String>> map);
}
