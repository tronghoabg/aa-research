package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import androidx.credentials.provider.BeginCreateCredentialRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CreateEntry;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.media3.datasource.HttpEngineDataSource$$ExternalSyntheticApiModelOutline0;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginCreateCredentialUtil {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final CreateEntry convertToJetpackResponse$lambda$0(android.service.credentials.CreateEntry createEntry) {
            CreateEntry.Companion companion = CreateEntry.Companion;
            Slice slice = createEntry.getSlice();
            x.e(slice, "getSlice(...)");
            return companion.fromSlice(slice);
        }

        static final CreateEntry convertToJetpackResponse$lambda$1(l lVar, Object obj) {
            return (CreateEntry) lVar.invoke(obj);
        }

        static final boolean convertToJetpackResponse$lambda$2(CreateEntry createEntry) {
            return createEntry != null;
        }

        static final CreateEntry convertToJetpackResponse$lambda$4(CreateEntry createEntry) {
            x.c(createEntry);
            return createEntry;
        }

        static final CreateEntry convertToJetpackResponse$lambda$5(l lVar, Object obj) {
            return (CreateEntry) lVar.invoke(obj);
        }

        private final void populateCreateEntries(BeginCreateCredentialResponse.Builder builder, List<CreateEntry> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Slice slice = CreateEntry.Companion.toSlice((CreateEntry) it.next());
                if (slice != null) {
                    builder.addCreateEntry(new android.service.credentials.CreateEntry(slice));
                }
            }
        }

        private final void populateRemoteEntry(BeginCreateCredentialResponse.Builder builder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            builder.setRemoteCreateEntry(new android.service.credentials.RemoteEntry(RemoteEntry.Companion.toSlice(remoteEntry)));
        }

        public final BeginCreateCredentialRequest convertToFrameworkRequest(androidx.credentials.provider.BeginCreateCredentialRequest beginCreateCredentialRequest) {
            x.f(beginCreateCredentialRequest, "request");
            return new BeginCreateCredentialRequest(beginCreateCredentialRequest.getType(), beginCreateCredentialRequest.getCandidateQueryData(), beginCreateCredentialRequest.getCallingAppInfo() != null ? new CallingAppInfo(beginCreateCredentialRequest.getCallingAppInfo().getPackageName(), beginCreateCredentialRequest.getCallingAppInfo().getSigningInfo(), beginCreateCredentialRequest.getCallingAppInfo().getOrigin$credentials()) : null);
        }

        public final BeginCreateCredentialResponse convertToFrameworkResponse(androidx.credentials.provider.BeginCreateCredentialResponse beginCreateCredentialResponse) {
            x.f(beginCreateCredentialResponse, "response");
            BeginCreateCredentialResponse.Builder builder = new BeginCreateCredentialResponse.Builder();
            populateCreateEntries(builder, beginCreateCredentialResponse.getCreateEntries());
            populateRemoteEntry(builder, beginCreateCredentialResponse.getRemoteEntry());
            BeginCreateCredentialResponse beginCreateCredentialResponseBuild = builder.build();
            x.e(beginCreateCredentialResponseBuild, "build(...)");
            return beginCreateCredentialResponseBuild;
        }

        public final androidx.credentials.provider.BeginCreateCredentialRequest convertToJetpackRequest$credentials(BeginCreateCredentialRequest beginCreateCredentialRequest) {
            androidx.credentials.provider.CallingAppInfo callingAppInfoCreate;
            x.f(beginCreateCredentialRequest, "request");
            BeginCreateCredentialRequest.Companion companion = androidx.credentials.provider.BeginCreateCredentialRequest.Companion;
            String type = beginCreateCredentialRequest.getType();
            x.e(type, "getType(...)");
            Bundle data = beginCreateCredentialRequest.getData();
            x.e(data, "getData(...)");
            CallingAppInfo callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion companion2 = androidx.credentials.provider.CallingAppInfo.Companion;
                String packageName = callingAppInfo.getPackageName();
                x.e(packageName, "getPackageName(...)");
                SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                x.e(signingInfo, "getSigningInfo(...)");
                callingAppInfoCreate = companion2.create(packageName, signingInfo, callingAppInfo.getOrigin());
            } else {
                callingAppInfoCreate = null;
            }
            return companion.createFrom(type, data, callingAppInfoCreate);
        }

        public final androidx.credentials.provider.BeginCreateCredentialResponse convertToJetpackResponse(BeginCreateCredentialResponse beginCreateCredentialResponse) {
            RemoteEntry remoteEntryFromSlice;
            x.f(beginCreateCredentialResponse, "frameworkResponse");
            Stream stream = Collection.EL.stream(beginCreateCredentialResponse.getCreateEntries());
            final l lVar = new l() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$0(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12413m(obj));
                }
            };
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda1
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$1(lVar, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final l lVar2 = new l() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$2((CreateEntry) obj));
                }
            };
            Stream streamFilter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda3
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) lVar2.invoke(obj)).booleanValue();
                }
            });
            final l lVar3 = new l() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    CreateEntry createEntry = (CreateEntry) obj;
                    BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$4(createEntry);
                    return createEntry;
                }
            };
            Object objCollect = streamFilter.map(new Function() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda5
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$5(lVar3, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            x.e(objCollect, "collect(...)");
            List list = (List) objCollect;
            android.service.credentials.RemoteEntry remoteCreateEntry = beginCreateCredentialResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.Companion;
                Slice slice = remoteCreateEntry.getSlice();
                x.e(slice, "getSlice(...)");
                remoteEntryFromSlice = companion.fromSlice(slice);
            } else {
                remoteEntryFromSlice = null;
            }
            return new androidx.credentials.provider.BeginCreateCredentialResponse(list, remoteEntryFromSlice);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
