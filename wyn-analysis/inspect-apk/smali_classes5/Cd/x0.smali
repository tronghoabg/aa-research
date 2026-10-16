.class public final synthetic LCd/x0;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# static fields
.field public static final a:LCd/x0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LCd/x0;

    .line 2
    .line 3
    const-class v1, LCd/w0;

    .line 4
    .line 5
    const-string v2, "<init>(Ljava/lang/String;)V"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LCd/x0;->a:LCd/x0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LCd/w0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Ktor http-client"

    .line 7
    .line 8
    iput-object v1, v0, LCd/w0;->a:Ljava/lang/String;

    .line 9
    .line 10
    return-object v0
.end method
