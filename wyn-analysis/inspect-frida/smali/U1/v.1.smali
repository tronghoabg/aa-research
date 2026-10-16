.class public final LU1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:LU1/z;


# direct methods
.method public constructor <init>(LU1/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU1/v;->a:LU1/z;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/v;->a:LU1/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, LU1/z;->M:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object v0, v0, LU1/z;->i:LQ1/s;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LQ1/s;->e(I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
