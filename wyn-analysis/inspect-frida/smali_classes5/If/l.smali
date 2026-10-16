.class public final LIf/l;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LIf/m;

.field public b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:LIf/m;

.field public e:I


# direct methods
.method public constructor <init>(LIf/m;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LIf/l;->d:LIf/m;

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
    iput-object p1, p0, LIf/l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LIf/l;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LIf/l;->e:I

    .line 9
    .line 10
    iget-object p1, p0, LIf/l;->d:LIf/m;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LIf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
