.class public final synthetic LCd/y;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# static fields
.field public static final a:LCd/y;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LCd/y;

    .line 2
    .line 3
    const-string v4, "<init>()V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const-class v2, LCd/x;

    .line 8
    .line 9
    const-string v3, "<init>"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LCd/y;->a:LCd/y;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, LCd/x;

    .line 2
    .line 3
    invoke-direct {v0}, LCd/x;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
