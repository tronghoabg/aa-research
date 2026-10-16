.class public final LJ9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lta/f;


# instance fields
.field public final a:LJ9/I;

.field public b:LHe/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lta/f;->d()Lta/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LJ9/u;->c:Lta/f;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(LJ9/I;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LSe/e;->a:LSe/e;

    .line 5
    .line 6
    iput-object v0, p0, LJ9/u;->b:LHe/g;

    .line 7
    .line 8
    iput-object p1, p0, LJ9/u;->a:LJ9/I;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()LHe/g;
    .locals 5

    .line 1
    iget-object v0, p0, LJ9/u;->b:LHe/g;

    .line 2
    .line 3
    iget-object v1, p0, LJ9/u;->a:LJ9/I;

    .line 4
    .line 5
    invoke-static {}, Lta/f;->parser()Lcom/google/protobuf/Parser;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, LJ9/I;->a(Lcom/google/protobuf/Parser;)LSe/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, LJ9/s;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, p0, v3}, LJ9/s;-><init>(LJ9/u;I)V

    .line 17
    .line 18
    .line 19
    new-instance v3, LSe/r;

    .line 20
    .line 21
    sget-object v4, LNe/b;->d:Lya/b;

    .line 22
    .line 23
    invoke-direct {v3, v1, v2, v4}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3}, LHe/g;->d(LHe/g;)LHe/g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, LJ9/s;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {v1, p0, v2}, LJ9/s;-><init>(LJ9/u;I)V

    .line 34
    .line 35
    .line 36
    new-instance v2, LSe/r;

    .line 37
    .line 38
    invoke-direct {v2, v0, v4, v1}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 39
    .line 40
    .line 41
    return-object v2
.end method
