.class public interface abstract LZ1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final S8:LXd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LXd/c;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, LXd/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LZ1/g;->S8:LXd/c;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract f()V
.end method

.method public abstract h(Landroid/os/Looper;LV1/k;)V
.end method

.method public abstract j(LZ1/d;LN1/n;)LZ1/f;
.end method

.method public abstract k(LZ1/d;LN1/n;)LS3/l;
.end method

.method public abstract l(LN1/n;)I
.end method

.method public abstract release()V
.end method
