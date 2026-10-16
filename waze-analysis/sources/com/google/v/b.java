package com.google.v;

import android.R;
import com.google.v.b;
import com.google.v.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class b<MessageType extends c<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> implements fh {
    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        iterable.getClass();
        if (!(iterable instanceof fb)) {
            if (iterable instanceof fp) {
                list.addAll((Collection) iterable);
                return;
            } else {
                addAllCheckingNulls(iterable, list);
                return;
            }
        }
        List listA = ((fb) iterable).a();
        fb fbVar = (fb) list;
        int size = list.size();
        for (Object obj : listA) {
            if (obj == null) {
                String str = "Element at index " + (fbVar.size() - size) + " is null.";
                int size2 = fbVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    fbVar.remove(size2);
                }
            } else if (obj instanceof v) {
                fbVar.b();
            } else if (obj instanceof byte[]) {
                v.q((byte[]) obj);
                fbVar.b();
            } else {
                fbVar.add((String) obj);
            }
        }
    }

    private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof fr) {
                ((fr) list).e(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    resetListAndThrow(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            R.animator animatorVar = (Object) list2.get(i2);
            if (animatorVar == null) {
                resetListAndThrow(list, size2);
            }
            list.add(animatorVar);
        }
    }

    private String getReadingExceptionMessage(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    protected static gd newUninitializedMessageException(fi fiVar) {
        return new gd();
    }

    private static void resetListAndThrow(List<?> list, int i2) {
        String str = "Element at index " + (list.size() - i2) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i2) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType mo19743clone();

    protected abstract BuilderType internalMergeFrom(MessageType messagetype);

    public boolean mergeDelimitedFrom(InputStream inputStream, de deVar) throws IOException {
        int i2 = inputStream.read();
        if (i2 == -1) {
            return false;
        }
        m19747mergeFrom((InputStream) new a(inputStream, z.P(i2, inputStream)), deVar);
        return true;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m19744mergeFrom(v vVar) throws eu {
        try {
            z zVarF = vVar.f();
            m19745mergeFrom(zVarF);
            zVarF.E(0);
            return this;
        } catch (eu e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e3);
        }
    }

    @Override // com.google.v.fh
    public abstract BuilderType mergeFrom(z zVar, de deVar);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, de.f12840a);
    }

    @Override // com.google.v.fh
    public BuilderType mergeFrom(v vVar, de deVar) throws eu {
        try {
            z zVarF = vVar.f();
            mergeFrom(zVarF, deVar);
            zVarF.E(0);
            return this;
        } catch (eu e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e3);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m19745mergeFrom(z zVar) {
        return (BuilderType) mergeFrom(zVar, de.f12840a);
    }

    @Override // com.google.v.fh
    public BuilderType mergeFrom(fi fiVar) {
        return (BuilderType) internalMergeFrom((c) fiVar);
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m19746mergeFrom(InputStream inputStream) {
        z zVarX = z.X(inputStream);
        m19745mergeFrom(zVarX);
        zVarX.E(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m19747mergeFrom(InputStream inputStream, de deVar) {
        z zVarX = z.X(inputStream);
        mergeFrom(zVarX, deVar);
        zVarX.E(0);
        return this;
    }

    @Override // com.google.v.fh
    public BuilderType mergeFrom(byte[] bArr) {
        return (BuilderType) mo19748mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public BuilderType mo19748mergeFrom(byte[] bArr, int i2, int i3) throws eu {
        try {
            z zVarS = z.S(bArr, i2, i3);
            m19745mergeFrom(zVarS);
            zVarS.E(0);
            return this;
        } catch (eu e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e3);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public BuilderType mo19749mergeFrom(byte[] bArr, int i2, int i3, de deVar) throws eu {
        try {
            z zVarS = z.S(bArr, i2, i3);
            mergeFrom(zVarS, deVar);
            zVarS.E(0);
            return this;
        } catch (eu e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e3);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType m19750mergeFrom(byte[] bArr, de deVar) {
        return (BuilderType) mo19749mergeFrom(bArr, 0, bArr.length, deVar);
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }
}
