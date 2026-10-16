.class public final LHf/s;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:LHf/t;

.field public d:Ljava/lang/Object;

.field public e:LHf/m;


# direct methods
.method public constructor <init>(LHf/t;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHf/s;->c:LHf/t;

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
    iput-object p1, p0, LHf/s;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LHf/s;->b:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LHf/s;->b:I

    .line 9
    .line 10
    iget-object p1, p0, LHf/s;->c:LHf/t;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LHf/t;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
