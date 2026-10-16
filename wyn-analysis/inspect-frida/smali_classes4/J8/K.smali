.class public final LJ8/K;
.super LJ8/x;
.source "SourceFile"


# instance fields
.field public final synthetic a:LPc/T;

.field public final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;LPc/T;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LJ8/K;->a:LPc/T;

    .line 5
    .line 6
    iput-object p1, p0, LJ8/K;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onCodeSent(Ljava/lang/String;LJ8/w;)V
    .locals 0

    .line 1
    iget-object p2, p0, LJ8/K;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 2
    .line 3
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 4
    .line 5
    iget-object p2, p2, LK8/f;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, LJ8/u;->Y(Ljava/lang/String;Ljava/lang/String;)LJ8/u;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, LJ8/K;->a:LPc/T;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, LPc/T;->onVerificationCompleted(LJ8/u;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onVerificationCompleted(LJ8/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ8/K;->a:LPc/T;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LPc/T;->onVerificationCompleted(LJ8/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onVerificationFailed(Ls8/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ8/K;->a:LPc/T;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LPc/T;->onVerificationFailed(Ls8/j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
