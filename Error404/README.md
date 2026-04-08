# Camazotz -- Design Documentation 

Team Name: Error 404 

Team Members: 
1. Freny Kansagra
2. Damarla Rohit Phani Datta
3. Nayan Gupta
4. Prabal Verma
5. Anshuma
              

# Phase 1 (Design Disaster)

## Objective
Explain the intent behind your intentionally flawed design.

Brief Description:
> The app is a Tic Tac Toe Android game where two users must log in before playing. The user flow includes multiple login steps followed by the game screen.
The design intentionally introduces usability issues to confuse users, increase friction, and demonstrate poor UX practices.


## Intentional UX Issues Introduced

### Issue 1

Type: CTA, Visibility

What was done:
> One important button is not clearly visible on the screen and doesn’t stand out much from the background.

Why this was done:
> To see how users behave when the main action is not easily noticeable.

Expected User Difficulty:
> Users might not find the button quickly and may think they are stuck or the app is not working properly.

### Issue 2

Type: Navigation / Flow

What was done:  
> Some pages are connected in a way that users can end up going back to previous pages without realizing it.

Why this was done: 
> To check how users handle navigation when the flow is not very clear.

Expected User Difficulty:  
> Users may feel like they are stuck in the same steps and get confused about how to move forward.

### Issue 3

Type:  Interaction / Consistency

What was done: 
> There is a way to enter the game, but it is not noticeable. It is not very obvious and may require users to explore before figuring them out.

Why this was done: 
> To observe how users react when actions are not clearly defined or easy to identify.

Expected User Difficulty: 
> Users may take time to understand how to exit properly or may try different options before finding the correct one.

### Issue 4

Type: CTA / Navigation

What was done: 
> Among multiple available buttons, only one leads to the next step, but it is not clearly distinguishable from the others.

Why this was done:
> To observe how users identify the correct action when multiple options appear similar.

Expected User Difficulty: 
> Users may try different buttons before finding the correct one, leading to confusion and extra effort.

### Issue 5

Type: Semantics / Cognitive Load

What was done: 
> Input fields use placeholder text that is not easily understandable.

Why this was done:
> To see how users handle input when clear instructions are not provided.

Expected User Difficulty: 
> Users may not understand what to enter or may input incorrect data.

### Issue 6

Type:  Navigation / Flow / Cognitive Load

What was done:
> User input is divided across multiple separate screens instead of being grouped together, increasing the number of steps required to complete the process.

Why this was done:
> To explore how breaking a simple flow into multiple steps affects user patience and understanding.

Expected User Difficulty: 
> Users may feel the process is unnecessarily long and may lose track of progress.

### Issue 7

Type:  Navigation / Consistency / Cognitive Load

What was done:
> The login process spans across multiple screens , with similar layouts but slight differences in element placement and actions.

Why this was done:
> To test how users adapt to repeated but slightly changing interfaces.

Expected User Difficulty: 
> Users may get confused between screens, feel repetitive friction, or miss important actions.

### Issue 8

Type:  Feedback / Consistency / Semantics

What was done: 
> Game elements and labels are not always aligned with expected meaning. Symbols and messages may not always correspond correctly to the actual game state.

Why this was done:
> To observe how users rely on visual and textual feedback during gameplay.

Expected User Difficulty: 
> Users may misinterpret what is happening in the game or lose trust in the displayed information.

### Issue 9

Type:  Semantics / Communication

What was done:
> Some instruction titles and result messages have been altered in a way that does not clearly match their actual purpose.

Why this was done:
> To test how users respond when system messages are unclear or misleading.

Expected User Difficulty: 
> Users may misunderstand outcomes or instructions, leading to confusion during gameplay.

### Issue 10

Type:  Logic Feedback / Consistency

What was done:
> The turn-based system does not always clearly differentiate between players, causing similar symbols or patterns to appear repeatedly.

Why this was done:
> To explore how users track turns and game state when feedback is not fully reliable.

Expected User Difficulty: 
> Users may lose track of turns or become unsure about which player is currently playing.

### Issue 11

Type:  Navigation / Flow / Consistency

What was done:
> The game section includes multiple related screens, but transitions between them are not clearly defined. Certain actions intended to move forward may lead back to the same screen instead of progressing.

Why this was done:
> To observe how users interpret navigation when screen transitions are not clearly distinguishable.

Expected User Difficulty: 
> Users may feel like they are not progressing, repeat the same action multiple times, or assume the feature is not working.

### Issue 12

Type:  Input / Validation / Semantics

What was done:
> Input fields do not enforce strict format or length constraints, allowing flexible entries without clear boundaries.

Why this was done:
> To observe how users behave when validation is minimal or not immediately enforced.

Expected User Difficulty: 
> Users may enter inconsistent or unexpected data, leading to confusion during later stages.

### Issue 13

Type:  CTA / Cognitive Load

What was done:
> Additional buttons are present in the interface that do not contribute directly to the main flow.

Why this was done:
> To explore how extra options affect user focus and decision-making.

Expected User Difficulty: 
> Users may get distracted, try irrelevant actions, or take longer to complete tasks.

### Issue 14

Type:  Layout / Visual Hierarchy

What was done:
> Some UI elements are not properly aligned and appear rotated or tilted instead of following a structured layout.

Why this was done:
> To observe how users interact with interfaces that do not follow standard alignment patterns.

Expected User Difficulty:
> Users may find it difficult to read or interact with elements accurately.

### Issue 15

Type: Layout / Visibility

What was done:
> Certain UI components overlap with each other.

Why this was done:
> To test how users handle cluttered layouts with limited spacing.

Expected User Difficulty:
> Users may miss important elements or interact with the wrong component.

### Issue 16

Type: Visual Design / Accessibility

What was done:
> A visually heavy and distracting background is used behind important content.

Why this was done:
> To evaluate how background complexity affects user focus and readability.

Expected User Difficulty:
> Users may struggle to focus on key actions or read content clearly.

### Issue 17

Type: Visual Design / Accessibility

What was done:
> Color combinations used for buttons and text are inconsistent and not optimized for readability.

Why this was done:
> To explore how users respond to visually intense or inconsistent color schemes.

Expected User Difficulty:
> Users may find it hard to distinguish actions or read text clearly.

### Issue 18

Type: Layout / Consistency

What was done:
> UI elements are placed without a consistent alignment or structure across different screens.

Why this was done:
> To test how users navigate interfaces without predictable layouts.

Expected User Difficulty:
> Users may take longer to locate elements or feel disoriented.

### Issue 19

Type: Interaction / Accessibility

What was done:
> Interactive elements are placed very close to each other with minimal spacing.

Why this was done:
> To observe how users interact when touch targets are not well separated.

Expected User Difficulty:
> Users may accidentally select unintended options.

### Issue 20

Type: Feedback / Interaction

What was done:
> Some actions do not provide clear or immediate feedback after interaction.

Why this was done:
> To test how users interpret system responses when feedback is minimal.

Expected User Difficulty:
> Users may not be sure whether their action was successful.

### Issue 21

Type: Navigation / Flow

What was done:
> Certain actions reload the same screen instead of transitioning to a new one.

Why this was done:
> To observe how users react when navigation does not lead to new content.

Expected User Difficulty:
> Users may feel stuck and repeat the same actions.

### Issue 22

Type: Logic / Consistency

What was done:
> The starting player in the game is not fixed and may vary between sessions.

Why this was done:
> To explore how users adapt to changing initial conditions.

Expected User Difficulty:
> Users may not clearly understand turn order at the beginning.

### Issue 23

Type: Layout / Interaction

What was done:
> Important elements are placed within scrollable areas and may not be visible initially.

Why this was done:
> To observe how users explore vertically extended layouts.

Expected User Difficulty:
> Users may miss important actions located outside the initial view.

# Functional Bugs / Issues 

Bug 1:
- Description: A key actionable element is not easily noticeable on the screen
- Impact: Users may struggle to proceed
- Workaround : Careful exploration of UI

Bug 2:
- Description: Some navigation paths may take users back to previously visited screens
- Impact: Creates confusion in flow progression
- Workaround : Try alternative navigation options

Bug 3:
- Description: Certain actions are not clearly discoverable and may require exploration
- Impact: Slows down interaction
- Workaround: Interact with different elements

Bug 4:
- Description: Only specific buttons trigger forward navigation while others appear similar
- Impact: Users may press incorrect options
- Workaround: Try different buttons

Bug 5:
- Description: Input fields contain unclear or unfamiliar placeholder content
- Impact: Incorrect or delayed input
- Workaround: Guess expected input

Bug 6:
- Description: Input flow is distributed across multiple screens
- Impact: Increased steps for simple tasks
- Workaround: Continue through all steps

Bug 7:
- Description: Game symbols may not always align with expected positions
- Impact: Misinterpretation of game board
- Workaround: Track moves manually

Bug 8:
- Description: Game messages do not give out proper information
- Impact: Confusion in obtaining information regarding game
- Workaround: Verify displayed messages of gameplay

Bug 9:
- Description: Wrong display of player outcome
- Impact: Difficulty tracking turns
- Workaround: Observe outcome sequence carefully

Bug 10:
- Description: Some navigation actions do not lead to new screens and may reload the same page
- Impact: Blocks access to certain features
- Workaround: Retry or explore other paths

Bug 11:
- Description: Input fields accept unrestricted or unexpected formats
- Impact: May lead to inconsistent data entry
- Workaround: Enter data carefully

Bug 12:
- Description: Some buttons do not perform any noticeable action
- Impact: Confuses users and interrupts flow
- Workaround: Ignore non-responsive buttons

Bug 13:
- Description: Some UI elements appear rotated or misaligned
- Impact: Reduces readability and interaction clarity
- Workaround: Adjust viewing and interact carefully

Bug 14:
- Description: UI components overlap in certain screens
- Impact: Blocks visibility and interaction
- Workaround: Try tapping around visible areas

Bug 15:
- Description: Background reduces clarity of foreground content
- Impact: Makes text harder to read
- Workaround: Focus carefully on content

Bug 16:
- Description: Buttons placed very close may lead to accidental taps
- Impact: Incorrect actions triggered
- Workaround: Careful tapping

Bug 17:
- Description: Some actions do not provide clear feedback
- Impact: Creates uncertainty in interaction
- Workaround: Repeat action or observe changes

Bug 18:
- Description: Some actions restart the same screen instead of progressing
- Impact: Prevents forward navigation
- Workaround: Try alternative actions

Bug 19:
- Description: Starting player varies between sessions
- Impact: Reduces predictability
- Workaround: Observe first move


# Design Anti-Patterns Used

Hidden / Low Discoverability Actions → Important actions are not easily visible

Ambiguous CTAs → Multiple buttons appear similar but behave differently

Poor Visual Hierarchy → No clear distinction between primary and secondary actions

Confusing Navigation → Loops and unclear transitions between screens

Fragmented User Flow → Inputs and steps split across multiple pages

Inconsistent Interaction Patterns → Similar actions behave differently

Unclear Semantics → Placeholder text and labels are not easily understandable

Misleading Feedback → Messages and results do not match actual system state

Broken System Feedback → Users cannot rely on visual/game indicators

Cognitive Overload → Multiple steps, unclear inputs, and repeated screens increase effort

Lack of Input Validation → Fields allow unrestricted input

Irrelevant / Redundant Actions → Extra buttons increase confusion

Poor Layout Alignment → Elements are rotated or not properly structured

Overlapping Components → UI elements interfere with each other

Varied languages displaying misleading information

Low Readability Design → Background and colors reduce clarity

Lack of Structured Layout → No consistent alignment or grid system

Poor Touch Target Design → Buttons are too close to each other

Lack of System Feedback → Actions do not clearly confirm results

Loop / Dead-End Navigation → Actions do not lead to new states

Inconsistent Initial State → Game does not start predictably

Multiple Competing CTAs → Several actions are presented together without clear priority
