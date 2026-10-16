.class public final LSe/n;
.super LHe/n;
.source "SourceFile"


# instance fields
.field public final a:LHe/g;


# direct methods
.method public constructor <init>(LHe/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LSe/n;->a:LHe/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(LHe/o;)V
    .locals 2

    .line 1
    new-instance v0, LSe/l;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, v1}, LSe/l;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LSe/n;->a:LHe/g;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
