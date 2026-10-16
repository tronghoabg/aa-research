.class public abstract LJ8/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lh7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lh7/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/String;

    .line 5
    .line 6
    const-string v2, "PhoneAuthProvider"

    .line 7
    .line 8
    invoke-direct {v0, v2, v1}, Lh7/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LJ8/x;->zza:Lh7/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public abstract onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
.end method

.method public abstract onCodeSent(Ljava/lang/String;LJ8/w;)V
.end method

.method public abstract onVerificationCompleted(LJ8/u;)V
.end method

.method public abstract onVerificationFailed(Ls8/j;)V
.end method
