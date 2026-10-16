.class public final LVd/b;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LVd/d;

.field public d:I


# direct methods
.method public constructor <init>(LVd/d;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVd/b;->c:LVd/d;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LVd/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LVd/b;->d:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LVd/b;->d:I

    .line 9
    .line 10
    iget-object p1, p0, LVd/b;->c:LVd/d;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LVd/d;->g(ILlf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
